import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ParkingTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 3 1").append(NEW_LINE);
		in.append("1 6").append(NEW_LINE);
		in.append("3 5").append(NEW_LINE);
		in.append("2 8").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(33);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("10 8 6").append(NEW_LINE);
		in.append("15 30").append(NEW_LINE);
		in.append("25 50").append(NEW_LINE);
		in.append("70 80").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(480);
	}

	@Override
	protected Class<?> getTestClass() {
		return Parking.class;
	}

}
