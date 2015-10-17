import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PreludesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("Ab minor").append(NEW_LINE);
		in.append("D# major").append(NEW_LINE);
		in.append("G minor").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("Case 1: G# minor").append(NEW_LINE);
		expected.append("Case 2: Eb major").append(NEW_LINE);
		expected.append("Case 3: UNIQUE");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return Preludes.class;
	}

}
