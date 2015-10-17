import static org.assertj.core.api.Assertions.assertThat;

import java.io.OutputStream;

import org.junit.Test;



public class ClosingTheLoopTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("5B").append(NEW_LINE);
		in.append("4").append(NEW_LINE);
		in.append("6R 1B 7R 3B").append(NEW_LINE);
		in.append("7").append(NEW_LINE);
		in.append("5B 4R 3R 2R 5R 4R 3R").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("20B 20R").append(NEW_LINE);
		
		OutputStream out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("Case #1: 0").append(NEW_LINE);
		expected.append("Case #2: 13").append(NEW_LINE);
		expected.append("Case #3: 8").append(NEW_LINE);
		expected.append("Case #4: 38");

		assertThat(out.toString()).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return ClosingTheLoop.class;
	}

}
