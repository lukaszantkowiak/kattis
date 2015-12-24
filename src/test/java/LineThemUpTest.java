import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class LineThemUpTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5").append(NEW_LINE);
		in.append("JOE").append(NEW_LINE);
		in.append("BOB").append(NEW_LINE);
		in.append("ANDY").append(NEW_LINE);
		in.append("AL").append(NEW_LINE);
		in.append("ADAM").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("DECREASING");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("11").append(NEW_LINE);
		in.append("HOPE").append(NEW_LINE);
		in.append("ALI").append(NEW_LINE);
		in.append("BECKY").append(NEW_LINE);
		in.append("JULIE").append(NEW_LINE);
		in.append("MEGHAN").append(NEW_LINE);
		in.append("LAUREN").append(NEW_LINE);
		in.append("MORGAN").append(NEW_LINE);
		in.append("CARLI").append(NEW_LINE);
		in.append("MEGAN").append(NEW_LINE);
		in.append("ALEX").append(NEW_LINE);
		in.append("TOBIN").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("NEITHER");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("GEORGE").append(NEW_LINE);
		in.append("JOHN").append(NEW_LINE);
		in.append("PAUL").append(NEW_LINE);
		in.append("RINGO").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("INCREASING");
	}

	@Override
	protected Class<?> getTestClass() {
		return LineThemUp.class;
	}

}
