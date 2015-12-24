import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ColdPuterScienceTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("5 -10 15").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(1);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5").append(NEW_LINE);
		in.append("-14 -5 -39 -5 -7").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(5);
	}

	@Override
	protected Class<?> getTestClass() {
		return ColdPuterScience.class;
	}

}
