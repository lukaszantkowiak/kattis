import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class CarrotsTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 1").append(NEW_LINE);
		in.append("carrots?").append(NEW_LINE);
		in.append("bunnies").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(1);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 5").append(NEW_LINE);
		in.append("sovl problmz").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(5);
	}

	@Override
	protected Class<?> getTestClass() {
		return Carrots.class;
	}

}
