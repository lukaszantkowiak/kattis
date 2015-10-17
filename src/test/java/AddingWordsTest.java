import java.io.OutputStream;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AddingWordsTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("def foo 3").append(NEW_LINE);
		in.append("calc foo + bar =").append(NEW_LINE);
		in.append("def bar 7").append(NEW_LINE);
		in.append("def programming 10").append(NEW_LINE);
		in.append("calc foo + bar =").append(NEW_LINE);
		in.append("def is 4").append(NEW_LINE);
		in.append("def fun 8").append(NEW_LINE);
		in.append("calc programming - is + fun =").append(NEW_LINE);
		in.append("def fun 1").append(NEW_LINE);
		in.append("calc programming - is + fun =").append(NEW_LINE);
		in.append("clear");

		OutputStream os = execute(in);

		StringBuilder out = new StringBuilder();
		out.append("foo + bar = unknown").append(NEW_LINE);
		out.append("foo + bar = programming").append(NEW_LINE);
		out.append("programming - is + fun = unknown").append(NEW_LINE);
		out.append("programming - is + fun = bar");
		
		Assertions.assertThat(os.toString().replace(Character.valueOf((char)13).toString(), "")).isEqualTo(out.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return AddingWords.class;
	}
}
