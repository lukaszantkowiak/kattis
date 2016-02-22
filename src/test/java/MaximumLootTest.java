import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class MaximumLootTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("4 6").append(NEW_LINE);
		in.append("5 2 4 1").append(NEW_LINE);
		in.append("6 2 1 2").append(NEW_LINE);
		in.append("10 5").append(NEW_LINE);
		in.append("1 3 2 3 1 1 3 2 4 2").append(NEW_LINE);
		in.append("1 2 2 1 1 2 3 1 2 2").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("7").append(NEW_LINE);
		expected.append("10");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return MaximumLoot.class;
	}

}
