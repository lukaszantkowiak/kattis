import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class NumbersOnATreeTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 LR").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out.toString())).isEqualTo(11);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 RRL").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out.toString())).isEqualTo(2);
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out.toString())).isEqualTo(7);
	}

	@Override
	protected Class<?> getTestClass() {
		return NumbersOnATree.class;
	}

}
