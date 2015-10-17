import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class CompoundWordsTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("a bb").append(NEW_LINE);
		in.append("ab b").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("aab").append(NEW_LINE);
		expected.append("ab").append(NEW_LINE);
		expected.append("aba").append(NEW_LINE);
		expected.append("abb").append(NEW_LINE);
		expected.append("abbb").append(NEW_LINE);
		expected.append("ba").append(NEW_LINE);
		expected.append("bab").append(NEW_LINE);
		expected.append("bba").append(NEW_LINE);
		expected.append("bbab").append(NEW_LINE);
		expected.append("bbb");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return CompoundWords.class;
	}

}
