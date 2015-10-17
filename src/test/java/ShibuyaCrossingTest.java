import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ShibuyaCrossingTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 1").append(NEW_LINE);
		in.append("1 2").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(2);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 7").append(NEW_LINE);
		in.append("1 3").append(NEW_LINE);
		in.append("1 5").append(NEW_LINE);
		in.append("1 4").append(NEW_LINE);
		in.append("2 4").append(NEW_LINE);
		in.append("3 4").append(NEW_LINE);
		in.append("2 5").append(NEW_LINE);
		in.append("2 3").append(NEW_LINE);
		
		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(3);
	}

	@Override
	protected Class<?> getTestClass() {
		return ShibuyaCrossing.class;
	}

}
