import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RadioCommercialsTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6 20").append(NEW_LINE);
		in.append("18 35 6 80 15 21").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(61);
	}

	@Override
	protected Class<?> getTestClass() {
		return RadioCommercials.class;
	}

}
