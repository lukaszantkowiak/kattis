import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SimonSays2Test extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1").append(NEW_LINE);
		in.append("Simon says smile.").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("smile.");

		Assertions.assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("Simon says raise your right hand.").append(NEW_LINE);
		in.append("Lower your right hand.").append(NEW_LINE);
		in.append("Simon says raise your left hand.").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("raise your right hand.").append(NEW_LINE);
		expected.append(" raise your left hand.");

		Assertions.assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("Raise your right hand.").append(NEW_LINE);
		in.append("Lower your right hand.").append(NEW_LINE);
		in.append("Simon says raise your left hand.").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("raise your left hand.");

		Assertions.assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SimonSays2.class;
	}

}
