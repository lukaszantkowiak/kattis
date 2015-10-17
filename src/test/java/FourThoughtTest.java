import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class FourThoughtTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5").append(NEW_LINE);
		in.append("9").append(NEW_LINE);
		in.append("0").append(NEW_LINE);
		in.append("7").append(NEW_LINE);
		in.append("11").append(NEW_LINE);
		in.append("24").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("4 + 4 + 4 / 4 = 9").append(NEW_LINE);
		expected.append("4 * 4 - 4 * 4 = 0").append(NEW_LINE);
		expected.append("4 + 4 - 4 / 4 = 7").append(NEW_LINE);
		expected.append("no solution").append(NEW_LINE);
		expected.append("4 * 4 + 4 + 4 = 24");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return FourThought.class;
	}

}
