import org.assertj.core.api.Assertions;
import org.junit.Test;

public class VauvauTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 2 3 3").append(NEW_LINE);
		in.append("1 3 4");

		String os = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("both").append(NEW_LINE);
		expected.append("one").append(NEW_LINE);
		expected.append("none");

		Assertions.assertThat(os).isEqualTo(expected.toString());
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 3 4 5").append(NEW_LINE);
		in.append("4 9 5");

		String os = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("one").append(NEW_LINE);
		expected.append("none").append(NEW_LINE);
		expected.append("none");

		Assertions.assertThat(os).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Vauvau.class;
	}
}
