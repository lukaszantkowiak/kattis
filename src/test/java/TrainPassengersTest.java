import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class TrainPassengersTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 2").append(NEW_LINE);
		in.append("0 1 1").append(NEW_LINE);
		in.append("1 0 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("possible");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 2").append(NEW_LINE);
		in.append("1 0 0").append(NEW_LINE);
		in.append("0 1 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 2").append(NEW_LINE);
		in.append("0 1 0").append(NEW_LINE);
		in.append("1 0 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 2").append(NEW_LINE);
		in.append("0 1 1").append(NEW_LINE);
		in.append("0 0 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Override
	protected Class<?> getTestClass() {
		return TrainPassengers.class;
	}

}
