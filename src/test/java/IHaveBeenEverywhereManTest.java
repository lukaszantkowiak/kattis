import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class IHaveBeenEverywhereManTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("7").append(NEW_LINE);
		in.append("saskatoon").append(NEW_LINE);
		in.append("toronto").append(NEW_LINE);
		in.append("winnipeg").append(NEW_LINE);
		in.append("toronto").append(NEW_LINE);
		in.append("vancouver").append(NEW_LINE);
		in.append("saskatoon").append(NEW_LINE);
		in.append("toronto").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("edmonton").append(NEW_LINE);
		in.append("edmonton").append(NEW_LINE);
		in.append("edmonton").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("4").append(NEW_LINE);
		expected.append("1");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return IHaveBeenEverywhereMan.class;
	}

}
