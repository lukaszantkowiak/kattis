import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class IdentifyingMapTilesTest  extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder().append("3").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("1 1 1");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder().append("130").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("3 6 2");
	}

	@Override
	protected Class<?> getTestClass() {
		return IdentifyingMapTiles.class;
	}

}
