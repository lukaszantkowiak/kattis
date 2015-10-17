import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class MixedFractionsTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("27 12").append(NEW_LINE);
		in.append("2460000 98400").append(NEW_LINE);
		in.append("3 4000").append(NEW_LINE);
		in.append("0 0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("2 3 / 12").append(NEW_LINE);
		expected.append("25 0 / 98400").append(NEW_LINE);
		expected.append("0 3 / 4000");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return MixedFractions.class;
	}

}
