import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class KornislavTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 2 3 4").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(3);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 4 3 4").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(12);
	}

	@Override
	protected Class<?> getTestClass() {
		return Kornislav.class;
	}

}
