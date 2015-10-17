import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;


public abstract class AbstractTest {
	static final String NEW_LINE = "\n";

	
	protected abstract Class<?> getTestClass();


	protected OutputStream execute(StringBuilder in) throws Exception {
		PrintStream out = System.out;

		InputStream stream = new ByteArrayInputStream(in.toString().getBytes(StandardCharsets.UTF_8));
		OutputStream os = new TestOutputStream();

		System.setIn(stream);
		System.setOut(new PrintStream(os));

		execute();

		System.setOut(out);

		return os;
	}
	
	private void execute() throws Exception {
		Class<?> cls = Class.forName(getTestClass().getName());
		Method m = cls.getMethod("main", String[].class);
		String[] params = null; 
		m.invoke(null, (Object) params); 
	}
}
