import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class PlantingTreesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("2 3 4 3").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(7);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6").append(NEW_LINE);
		in.append("39 38 9 35 39 20").append(NEW_LINE);

		String out = execute(in);

		assertThat(Integer.parseInt(out)).isEqualTo(42);
	}

	@Override
	protected Class<?> getTestClass() {
		return PlantingTrees.class;
	}

}
