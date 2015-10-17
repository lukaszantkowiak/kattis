import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class N2084Test extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2 0 0 2").append(NEW_LINE);
		in.append("4 16 8 2").append(NEW_LINE);
		in.append("2 64 32 4").append(NEW_LINE);
		in.append("1024 1024 64 0").append(NEW_LINE);
		in.append("0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("4 0 0 0").append(NEW_LINE);
		expected.append("4 16 8 2").append(NEW_LINE);
		expected.append("2 64 32 4").append(NEW_LINE);
		expected.append("2048 64 0 0");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return N2084.class;
	}

}
