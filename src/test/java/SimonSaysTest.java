import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class SimonSaysTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("simon says write a program").append(NEW_LINE);
		in.append("print some output").append(NEW_LINE);
		in.append("simon whispers do not stress").append(NEW_LINE);
		in.append("simon says get balloons").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("write a program").append(NEW_LINE);
		expected.append("").append(NEW_LINE);
		expected.append("").append(NEW_LINE);
		expected.append("get balloons");
		
		assertThat(out).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return SimonSays.class;
	}

}
