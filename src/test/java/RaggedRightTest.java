import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RaggedRightTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("some blocks").append(NEW_LINE);
		in.append("of text line up").append(NEW_LINE);
		in.append("well on the right,").append(NEW_LINE);
		in.append("but").append(NEW_LINE);
		in.append("some don't.").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(283);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("this line is short").append(NEW_LINE);
		in.append("this one is a bit longer").append(NEW_LINE);
		in.append("and this is the longest of all.").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(218);
	}

	@Override
	protected Class<?> getTestClass() {
		return RaggedRight.class;
	}

}
