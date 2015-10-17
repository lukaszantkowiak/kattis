import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class DicegameTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 4 1 4").append(NEW_LINE);
		in.append("1 6 1 6").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("Emma");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1 8 1 8").append(NEW_LINE);
		in.append("1 10 2 5").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("Tie");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 5 2 7").append(NEW_LINE);
		in.append("1 5 2 5").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("Gunnar");
	}

	@Override
	protected Class<?> getTestClass() {
		return Dicegame.class;
	}

}
