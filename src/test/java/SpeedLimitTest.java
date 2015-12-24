import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SpeedLimitTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("20 2").append(NEW_LINE);
		in.append("30 6").append(NEW_LINE);
		in.append("10 7").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("60 1").append(NEW_LINE);
		in.append("30 5").append(NEW_LINE);
		in.append("4").append(NEW_LINE);
		in.append("15 1").append(NEW_LINE);
		in.append("25 2").append(NEW_LINE);
		in.append("30 3").append(NEW_LINE);
		in.append("10 5").append(NEW_LINE);
		in.append("-1").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("170 miles").append(NEW_LINE);
		expected.append("180 miles").append(NEW_LINE);
		expected.append("90 miles");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SpeedLimit.class;
	}
}
