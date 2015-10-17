import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class TimebombTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("***   * * * *** *** *** ***").append(NEW_LINE);
		in.append("* *   * * *   *   *   * *  ").append(NEW_LINE);
		in.append("* *   * *** *** *** *** ***").append(NEW_LINE);
		in.append("* *   *   * *     * *   * *").append(NEW_LINE);
		in.append("***   *   * *** *** *** ***").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("BEER!!");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("  *   * *** *** *** * *").append(NEW_LINE);
		in.append("  *   * **    * * * * *").append(NEW_LINE);
		in.append("  *   * *** *** *** ***").append(NEW_LINE);
		in.append("  *   * *   *   * *   *").append(NEW_LINE);
		in.append("  *   * *** *** ***   *").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("BOOM!!");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("*** ***   * *** ***   *").append(NEW_LINE);
		in.append("*   * *   * * *   *   *").append(NEW_LINE);
		in.append("*** * *   * *** ***   *").append(NEW_LINE);
		in.append("  * * *   *   * *     *").append(NEW_LINE);
		in.append("*** ***   * *** ***   *").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("BOOM!!");
	}

	@Test
	public void testCase4() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("*** *** *** * * ***").append(NEW_LINE);
		in.append("  *   *   * * * * *").append(NEW_LINE);
		in.append("***   * *** *** ***").append(NEW_LINE);
		in.append("*     *   *   * * *").append(NEW_LINE);
		in.append("***   * ***   * ***").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("BEER!!");
	}
	
	@Override
	protected Class<?> getTestClass() {
		return Timebomb.class;
	}

}
