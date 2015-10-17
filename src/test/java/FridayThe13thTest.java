import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class FridayThe13thTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("20 1").append(NEW_LINE);
		in.append("20").append(NEW_LINE);
		in.append("40 2").append(NEW_LINE);
		in.append("21 19").append(NEW_LINE);
		in.append("365 12").append(NEW_LINE);
		in.append("31 28 31 30 31 30 31 31 30 31 30 31").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("1").append(NEW_LINE);
		expected.append("2").append(NEW_LINE);
		expected.append("2");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return FridayThe13th.class;
	}

}
