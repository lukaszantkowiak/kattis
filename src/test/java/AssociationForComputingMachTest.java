import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class AssociationForComputingMachTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7 0").append(NEW_LINE);
		in.append("30 270 995 996 997 998 999").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("2 330");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7 1").append(NEW_LINE);
		in.append("30 270 995 996 997 998 999").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("2 570");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7 2").append(NEW_LINE);
		in.append("30 270 995 996 997 998 999").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("0 0");
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 0").append(NEW_LINE);
		in.append("1 300 299").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("2 301");
	}

	@Override
	protected Class<?> getTestClass() {
		return AssociationForComputingMach.class;
	}

}
