import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class BlackFridayTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("8").append(NEW_LINE);
		in.append("1 1 1 5 3 4 6 6").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(Integer.parseInt(out)).isEqualTo(4);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("4 4 4").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("none");
	}

	@Override
	protected Class<?> getTestClass() {
		return BlackFriday.class;
	}

}
