import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class CDTest extends AbstractTest {

	@Test
	@Ignore
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("4").append(NEW_LINE);
		in.append("0 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(2);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("4").append(NEW_LINE);
		in.append("3 1").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("0 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("2\n1");
	}

	@Test
	@Ignore
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 0").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("3 1").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("1").append(NEW_LINE);
		in.append("0 0").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("0\n1");
	}

	@Override
	protected Class<?> getTestClass() {
		return CD.class;
	}

}
