import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ApaxiaaaaaaaaaaaansTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder("bob").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("bob");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder("booob").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("bob");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder("boooooobapalaxxxxios").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("bobapalaxios");
	}

	@Override
	protected Class<?> getTestClass() {
		return Apaxiaaaaaaaaaaaans.class;
	}

}
