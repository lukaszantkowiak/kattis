import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SavingDaylightTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("June 22 2005 6:24 20:37").append(NEW_LINE);
		in.append("December 22 2005 7:24 17:30").append(NEW_LINE);
		in.append("November 2 2005 6:45 17:38").append(NEW_LINE);
		in.append("January 8 1992 7:45 18:46").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("June 22 2005 14 hours 13 minutes").append(NEW_LINE);
		expected.append("December 22 2005 10 hours 6 minutes").append(NEW_LINE);
		expected.append("November 2 2005 10 hours 53 minutes").append(NEW_LINE);
		expected.append("January 8 1992 11 hours 1 minutes");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SavingDaylight.class;
	}

}
