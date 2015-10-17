import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class ClockPicturesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("6").append(NEW_LINE);
		in.append("1 2 3 4 5 6").append(NEW_LINE);
		in.append("7 6 5 4 3 1").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("0 270000").append(NEW_LINE);
		in.append("180000 270000").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("possible");
	}

	@Test
	public void testCase3() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("7").append(NEW_LINE);
		in.append("140 130 110 120 125 100 105").append(NEW_LINE);
		in.append("235 205 215 220 225 200 240").append(NEW_LINE);

		String out = execute(in);

		assertThat(out).isEqualTo("impossible");
	}

	@Override
	protected Class<?> getTestClass() {
		return ClockPictures.class;
	}

}
