import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class EligibilityTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("EligibleContestant 2013/09/01 1995/03/12 10").append(NEW_LINE);
		in.append("IneligibleContestant 2009/09/01 1990/12/12 50").append(NEW_LINE);
		in.append("PetitionContestant 2009/09/01 1990/12/12 35").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("EligibleContestant eligible").append(NEW_LINE);
		expected.append("IneligibleContestant ineligible").append(NEW_LINE);
		expected.append("PetitionContestant coach petitions");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Eligibility.class;
	}

}
