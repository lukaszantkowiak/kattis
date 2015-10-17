import static org.assertj.core.api.Assertions.assertThat;

import java.io.OutputStream;

import org.junit.Test;

public class BabelfishTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("dog ogday").append(NEW_LINE);
		in.append("cat atcay").append(NEW_LINE);
		in.append("pig igpay").append(NEW_LINE);
		in.append("froot ootfray").append(NEW_LINE);
		in.append("loops oopslay").append(NEW_LINE);
		in.append("").append(NEW_LINE);
		in.append("atcay").append(NEW_LINE);
		in.append("ittenkay").append(NEW_LINE);
		in.append("oopslay").append(NEW_LINE);

		OutputStream os = execute(in);

		StringBuilder out = new StringBuilder();
		out.append("cat").append(NEW_LINE);
		out.append("eh").append(NEW_LINE);
		out.append("loops");

		assertThat(os.toString()).isEqualTo(out.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Babelfish.class;
	}

}
