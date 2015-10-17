import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class PegTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("  ooo  ").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);
		in.append("ooooooo").append(NEW_LINE);
		in.append("ooo.ooo").append(NEW_LINE);
		in.append("ooooooo").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(4);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("  ooo  ").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);
		in.append("..ooo..").append(NEW_LINE);
		in.append("oo...oo").append(NEW_LINE);
		in.append("..ooo..").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);
		in.append("  ooo  ").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(12);
	}

	@Override
	protected Class<?> getTestClass() {
		return Peg.class;
	}

}
