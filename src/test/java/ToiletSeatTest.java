import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ToiletSeatTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("UUUDDUDU").append(NEW_LINE);

		String out = execute(in);

		String[] result = out.split(NEW_LINE);
		assertThat(Integer.parseInt(result[0])).isEqualTo(6);
		assertThat(Integer.parseInt(result[1])).isEqualTo(7);
		assertThat(Integer.parseInt(result[2])).isEqualTo(4);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("UU").append(NEW_LINE);

		String out = execute(in);

		String[] result = out.split(NEW_LINE);
		assertThat(Integer.parseInt(result[0])).isEqualTo(0);
		assertThat(Integer.parseInt(result[1])).isEqualTo(1);
		assertThat(Integer.parseInt(result[2])).isEqualTo(0);
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("UD").append(NEW_LINE);

		String out = execute(in);

		String[] result = out.split(NEW_LINE);
		assertThat(Integer.parseInt(result[0])).isEqualTo(2);
		assertThat(Integer.parseInt(result[1])).isEqualTo(1);
		assertThat(Integer.parseInt(result[2])).isEqualTo(1);
	}

	@Override
	protected Class<?> getTestClass() {
		return ToiletSeat.class;
	}
}