import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SetnjaTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("P*P").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(6);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("L*R").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(25);
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("**").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(33);
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("LLLLLRRRRRLLLLLRRRRRLLLLLRRRRRLLLLL").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(35400942560L);
	}

	@Test
	public void testCase5() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("P").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(1);
	}

	@Test
	public void testCase6() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("L").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(2);
	}

	@Test
	public void testCase7() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("R").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(3);
	}

	@Test
	public void testCase8() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("LL").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(4);
	}

	@Test
	public void testCase9() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("*").append(NEW_LINE);

		final String out = execute(in);

		assertThat(Long.parseLong(out)).isEqualTo(6);
	}
	
	@Test
	public void testCase10() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("R*P*L").append(NEW_LINE);
		
		final String out = execute(in);
		
		assertThat(Long.parseLong(out)).isEqualTo(166);
	}

	@Override
	protected Class<?> getTestClass() {
		return Setnja.class;
	}
}
