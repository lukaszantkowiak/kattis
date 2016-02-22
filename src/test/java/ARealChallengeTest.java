import static org.assertj.core.api.StrictAssertions.assertThat;

import org.assertj.core.data.Offset;
import org.junit.Test;

public class ARealChallengeTest extends AbstractTest {
	private static final Offset<Double> OFFSET = Offset.offset(Math.pow(10, -6));

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder().append("16").append(NEW_LINE);

		String out = execute(in);

		assertThat(Double.parseDouble(out)).isEqualTo(16, OFFSET);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder().append("5").append(NEW_LINE);

		String out = execute(in);

		assertThat(Double.parseDouble(out)).isEqualTo(8.94427190999915878564, OFFSET);
	}

	@Override
	protected Class<?> getTestClass() {
		return ARealChallenge.class;
	}

}
