import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class BreadSortingTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("1 3 4 2").append(NEW_LINE);
		in.append("4 3 2 1").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("Possible");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6").append(NEW_LINE);
		in.append("1 2 3 4 5 6").append(NEW_LINE);
		in.append("6 5 4 3 2 1").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("Impossible");
	}

	@Override
	protected Class<?> getTestClass() {
		return BreadSorting.class;
	}

}
