import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class HeightOrderingTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("1 900 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919").append(NEW_LINE);
		in.append("2 919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900").append(NEW_LINE);
		in.append("3 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 900").append(NEW_LINE);
		in.append("4 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900 919").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("1 0").append(NEW_LINE);
		expected.append("2 190").append(NEW_LINE);
		expected.append("3 19").append(NEW_LINE);
		expected.append("4 171");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return HeightOrdering.class;
	}

}
