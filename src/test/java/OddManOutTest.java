import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class OddManOutTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("1 2147483647 2147483647").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("3 4 7 4 3").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("2 10 2 10 5").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("Case #1: 1").append(NEW_LINE);
		expected.append("Case #2: 7").append(NEW_LINE);
		expected.append("Case #3: 5");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return OddManOut.class;
	}

}
