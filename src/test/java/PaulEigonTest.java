import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class PaulEigonTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 3 7").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("paul");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 1 4").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("opponent");
	}

	@Override
	protected Class<?> getTestClass() {
		return PaulEigon.class;
	}

}
