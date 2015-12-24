import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SynchronizingListsTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("10").append(NEW_LINE);
		in.append("67").append(NEW_LINE);
		in.append("68").append(NEW_LINE);
		in.append("28").append(NEW_LINE);
		in.append("55").append(NEW_LINE);
		in.append("73").append(NEW_LINE);
		in.append("10").append(NEW_LINE);
		in.append("6").append(NEW_LINE);
		in.append("7").append(NEW_LINE);
		in.append("98").append(NEW_LINE);
		in.append("23").append(NEW_LINE);
		in.append("61").append(NEW_LINE);
		in.append("49").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("79").append(NEW_LINE);
		in.append("9").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("15").append(NEW_LINE);
		in.append("32").append(NEW_LINE);
		in.append("47").append(NEW_LINE);
		in.append("68").append(NEW_LINE);
		in.append("39").append(NEW_LINE);
		in.append("24").append(NEW_LINE);
		in.append("0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("6").append(NEW_LINE);
		expected.append("55").append(NEW_LINE);
		expected.append("73").append(NEW_LINE);
		expected.append("10").append(NEW_LINE);
		expected.append("").append(NEW_LINE);
		expected.append("68").append(NEW_LINE);
		expected.append("24").append(NEW_LINE);
		expected.append("39").append(NEW_LINE);
		expected.append("32").append(NEW_LINE);
		expected.append("1").append(NEW_LINE);
		expected.append("47").append(NEW_LINE);
		expected.append("15");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SynchronizingLists.class;
	}

}
