import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class BusNumbersTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6").append(NEW_LINE);
		in.append("180 141 174 143 142 175").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("141-143 174 175 180");
	}

	@Override
	protected Class<?> getTestClass() {
		return BusNumbers.class;
	}

}
