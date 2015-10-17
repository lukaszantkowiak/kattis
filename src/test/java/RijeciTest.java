import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class RijeciTest extends AbstractTest {

	@Test
	public void testClass1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("0 1");
	}

	@Test
	public void testClass2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("2 3");
	}

	@Test
	public void testClass3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("10").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("34 55");
	}
	
	@Override
	protected Class<?> getTestClass() {
		return Rijeci.class;
	}

}
