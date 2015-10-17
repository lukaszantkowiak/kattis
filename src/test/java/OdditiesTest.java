import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class OdditiesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("10").append(NEW_LINE);
		in.append("9").append(NEW_LINE);
		in.append("-5").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("10 is even").append(NEW_LINE);
		expected.append("9 is odd").append(NEW_LINE);
		expected.append("-5 is odd");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Oddities.class;
	}

}
