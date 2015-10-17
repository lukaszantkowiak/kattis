import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TheEasiestProblemIsThisOneTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3029").append(NEW_LINE);
		in.append("4").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("42").append(NEW_LINE);
		in.append("0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("37").append(NEW_LINE);
		expected.append("28").append(NEW_LINE);
		expected.append("28").append(NEW_LINE);
		expected.append("25");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return TheEasiestProblemIsThisOne.class;
	}

}
