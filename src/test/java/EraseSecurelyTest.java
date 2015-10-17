import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class EraseSecurelyTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1").append(NEW_LINE);
		in.append("10001110101000001111010100001110").append(NEW_LINE);
		in.append("01110001010111110000101011110001").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("Deletion succeeded");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("20").append(NEW_LINE);
		in.append("0001100011001010").append(NEW_LINE);
		in.append("0001000011000100").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("Deletion failed");
	}

	@Override
	protected Class<?> getTestClass() {
		return EraseSecurely.class;
	}

}
