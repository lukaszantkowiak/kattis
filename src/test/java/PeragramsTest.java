import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PeragramsTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("abc").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(2);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("aab").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(0);
	}

	@Override
	protected Class<?> getTestClass() {
		return Peragrams.class;
	}

}
