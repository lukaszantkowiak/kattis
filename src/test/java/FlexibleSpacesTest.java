import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class FlexibleSpacesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("10 3").append(NEW_LINE);
		in.append("1 4 8").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("1 2 3 4 6 7 8 9 10");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6 2").append(NEW_LINE);
		in.append("2 5").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("1 2 3 4 5 6");
	}

	@Override
	protected Class<?> getTestClass() {
		return FlexibleSpaces.class;
	}

}
