import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SafePassageTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 15 5").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(15);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 1 2 7 10").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(17);
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 12 1 3 8 6").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(29);
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 10 1 1 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(14);
	}

	@Test
	public void testCase5() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 10 10 10 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(32);
	}

	@Test
	public void testCase6() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 1 4 8").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(13);
	}

	@Override
	protected Class<?> getTestClass() {
		return SafePassage.class;
	}

}
