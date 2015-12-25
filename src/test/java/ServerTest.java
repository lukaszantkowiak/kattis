import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ServerTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6 180").append(NEW_LINE);
		in.append("45 30 55 20 80 20").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(4);
	}
	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("10 60").append(NEW_LINE);
		in.append("20 7 10 8 10 27 2 3 10 5").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(5);
	}

	@Override
	protected Class<?> getTestClass() {
		return Server.class;
	}
}
