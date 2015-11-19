import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class AmandaLoungesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 4").append(NEW_LINE);
		in.append("1 2 2").append(NEW_LINE);
		in.append("2 3 1").append(NEW_LINE);
		in.append("3 4 1").append(NEW_LINE);
		in.append("4 1 2").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(3);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 5").append(NEW_LINE);
		in.append("1 2 1").append(NEW_LINE);
		in.append("2 3 1").append(NEW_LINE);
		in.append("2 4 1").append(NEW_LINE);
		in.append("2 5 1").append(NEW_LINE);
		in.append("4 5 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 5").append(NEW_LINE);
		in.append("1 2 1").append(NEW_LINE);
		in.append("2 3 0").append(NEW_LINE);
		in.append("2 4 1").append(NEW_LINE);
		in.append("3 1 1").append(NEW_LINE);
		in.append("3 4 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(2);
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 5").append(NEW_LINE);
		in.append("1 2 2").append(NEW_LINE);
		in.append("2 3 1").append(NEW_LINE);
		in.append("3 4 1").append(NEW_LINE);
		in.append("4 5 2").append(NEW_LINE);
		in.append("5 1 2").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(2);
	}

	@Override
	protected Class<?> getTestClass() {
		return AmandaLounges.class;
	}

}
