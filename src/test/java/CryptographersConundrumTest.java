import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class CryptographersConundrumTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("SECRET").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(4);
	}
	
	@Override
	protected Class<?> getTestClass() {
		return CryptographersConundrum.class;
	}

}
