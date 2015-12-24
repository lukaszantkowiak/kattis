import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ACMContestScoringTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 E right").append(NEW_LINE);
		in.append("10 A wrong").append(NEW_LINE);
		in.append("30 C wrong").append(NEW_LINE);
		in.append("50 B wrong").append(NEW_LINE);
		in.append("100 A wrong").append(NEW_LINE);
		in.append("200 A right").append(NEW_LINE);
		in.append("250 C wrong").append(NEW_LINE);
		in.append("300 D right").append(NEW_LINE);
		in.append("-1").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("3 543");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7 H right").append(NEW_LINE);
		in.append("15 B wrong").append(NEW_LINE);
		in.append("30 E wrong").append(NEW_LINE);
		in.append("35 E right").append(NEW_LINE);
		in.append("80 B wrong").append(NEW_LINE);
		in.append("80 B right").append(NEW_LINE);
		in.append("100 D wrong").append(NEW_LINE);
		in.append("100 C wrong").append(NEW_LINE);
		in.append("300 C right").append(NEW_LINE);
		in.append("300 D wrong").append(NEW_LINE);
		in.append("-1").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("4 502");
	}

	@Override
	protected Class<?> getTestClass() {
		return ACMContestScoring.class;
	}

}
