import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class Kemija08Test extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("zepelepenapa papapripikapa").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("zelena paprika");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("bapas jepe doposapadnapa opovapa kepemipijapa").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("bas je dosadna ova kemija");
	}

	@Override
	protected Class<?> getTestClass() {
		return Kemija08.class;
	}

}
