import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SpavanacTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("10 10").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("9 25");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("0 30").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("23 45");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("23 40").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("22 55");
	}

	@Override
	protected Class<?> getTestClass() {
		return Spavanac.class;
	}

}
