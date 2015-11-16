import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class BobbysBetTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("5 6 2 3 3").append(NEW_LINE);
		in.append("5 6 2 3 4").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("no").append(NEW_LINE);
		expected.append("yes");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("2 2 9 10 100").append(NEW_LINE);
		in.append("1 2 10 10 1").append(NEW_LINE);
		in.append("1 2 10 10 2").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("yes").append(NEW_LINE);
		expected.append("no").append(NEW_LINE);
		expected.append("yes");
		
		assertThat(out).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return BobbysBet.class;
	}

}
