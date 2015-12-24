import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SymmetricOrderTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7").append(NEW_LINE);
		in.append("Bo").append(NEW_LINE);
		in.append("Pat").append(NEW_LINE);
		in.append("Jean").append(NEW_LINE);
		in.append("Kevin").append(NEW_LINE);
		in.append("Claude").append(NEW_LINE);
		in.append("William").append(NEW_LINE);
		in.append("Marybeth").append(NEW_LINE);
		in.append("6").append(NEW_LINE);
		in.append("Jim").append(NEW_LINE);
		in.append("Ben").append(NEW_LINE);
		in.append("Zoe").append(NEW_LINE);
		in.append("Joey").append(NEW_LINE);
		in.append("Frederick").append(NEW_LINE);
		in.append("Annabelle").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("John").append(NEW_LINE);
		in.append("Bill").append(NEW_LINE);
		in.append("Fran").append(NEW_LINE);
		in.append("Stan").append(NEW_LINE);
		in.append("Cece").append(NEW_LINE);
		in.append("0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("SET 1").append(NEW_LINE);
		expected.append("Bo").append(NEW_LINE);
		expected.append("Jean").append(NEW_LINE);
		expected.append("Claude").append(NEW_LINE);
		expected.append("Marybeth").append(NEW_LINE);
		expected.append("William").append(NEW_LINE);
		expected.append("Kevin").append(NEW_LINE);
		expected.append("Pat").append(NEW_LINE);
		expected.append("SET 2").append(NEW_LINE);
		expected.append("Jim").append(NEW_LINE);
		expected.append("Zoe").append(NEW_LINE);
		expected.append("Frederick").append(NEW_LINE);
		expected.append("Annabelle").append(NEW_LINE);
		expected.append("Joey").append(NEW_LINE);
		expected.append("Ben").append(NEW_LINE);
		expected.append("SET 3").append(NEW_LINE);
		expected.append("John").append(NEW_LINE);
		expected.append("Fran").append(NEW_LINE);
		expected.append("Cece").append(NEW_LINE);
		expected.append("Stan").append(NEW_LINE);
		expected.append("Bill");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SymmetricOrder.class;
	}

}
