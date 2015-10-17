import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class PrsteniTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("8 4 2").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("2/1").append(NEW_LINE);
		expected.append("4/1");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("12 3 8 4").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("4/1").append(NEW_LINE);
		expected.append("3/2").append(NEW_LINE);
		expected.append("3/1");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("300 1 1 300").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("300/1").append(NEW_LINE);
		expected.append("300/1").append(NEW_LINE);
		expected.append("1/1");
		
		assertThat(out).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return Prsteni.class;
	}

}
