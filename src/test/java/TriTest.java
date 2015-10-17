import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 3 8").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("5+3=8");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 15 3").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("5=15/3");
	}

	@Override
	protected Class<?> getTestClass() {
		return Tri.class;
	}

}
