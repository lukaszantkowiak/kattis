import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class QuickBrownFoxTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("The quick brown fox jumps over the lazy dog.").append(NEW_LINE);
		in.append("ZYXW, vu TSR Ponm lkj ihgfd CBA.").append(NEW_LINE);
		in.append(".,?!'\" 92384 abcde FGHIJ").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("pangram").append(NEW_LINE);
		expected.append("missing eq").append(NEW_LINE);
		expected.append("missing klmnopqrstuvwxyz");

		assertThat(out).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return QuickBrownFox.class;
	}

}
