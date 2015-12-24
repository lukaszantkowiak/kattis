import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class HittingTheTargetsTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("rectangle 1 1 10 5").append(NEW_LINE);
		in.append("circle 5 0 8").append(NEW_LINE);
		in.append("rectangle -5 3 5 8").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("1 1").append(NEW_LINE);
		in.append("4 5").append(NEW_LINE);
		in.append("10 10").append(NEW_LINE);
		in.append("-10 -1").append(NEW_LINE);
		in.append("4 -3").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("2").append(NEW_LINE);
		expected.append("3").append(NEW_LINE);
		expected.append("0").append(NEW_LINE);
		expected.append("0").append(NEW_LINE);
		expected.append("1");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return HittingTheTargets.class;
	}

}
