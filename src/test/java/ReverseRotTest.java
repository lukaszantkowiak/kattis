import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ReverseRotTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 ABCD").append(NEW_LINE);
		in.append("3 YO_THERE.").append(NEW_LINE);
		in.append("1 .DOT").append(NEW_LINE);
		in.append("14 ROAD").append(NEW_LINE);
		in.append("9 SHIFTING_AND_ROTATING_IS_NOT_ENCRYPTING").append(NEW_LINE);
		in.append("2 STRING_TO_BE_CONVERTED").append(NEW_LINE);
		in.append("1 SNQZDRQDUDQ").append(NEW_LINE);
		in.append("0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("EDCB").append(NEW_LINE);
		expected.append("CHUHKWBR.").append(NEW_LINE);
		expected.append("UPEA").append(NEW_LINE);
		expected.append("ROAD").append(NEW_LINE);
		expected.append("PWRAYF_LWNHAXWH.RHPWRAJAX_HMWJHPWRAORQ.").append(NEW_LINE);
		expected.append("FGVTGXPQEAGDAQVAIPKTVU").append(NEW_LINE);
		expected.append("REVERSE_ROT");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return ReverseRot.class;
	}

}
