import static org.assertj.core.api.StrictAssertions.assertThat;

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

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("cat").append(NEW_LINE);
		expected.append("eh").append(NEW_LINE);
		expected.append("loops");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Babelfish.class;
	}
}
