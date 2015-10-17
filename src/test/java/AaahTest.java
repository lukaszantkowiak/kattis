import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AaahTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("aaah").append(NEW_LINE);
		in.append("aaaaah");

		String os = execute(in);

		Assertions.assertThat(os).isEqualTo("no");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("aaah").append(NEW_LINE);
		in.append("ah");

		String os = execute(in);

		Assertions.assertThat(os).isEqualTo("go");
	}

	@Override
	protected Class<?> getTestClass() {
		return Aaah.class;
	}
}
