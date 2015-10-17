import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ReversebinaryTest extends AbstractTest {

	@Test
	public void testClass1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("13").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(11);
	}

	@Test
	public void testClass2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("47").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(61);
	}

	@Override
	protected Class<?> getTestClass() {
		return Reversebinary.class;
	}

}
