import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class LadderTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("500 70").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(533);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1000 10").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(5759);
	}

	@Override
	protected Class<?> getTestClass() {
		return Ladder.class;
	}

}
