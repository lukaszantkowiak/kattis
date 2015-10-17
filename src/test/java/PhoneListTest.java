import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class PhoneListTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("3").append(NEW_LINE);
		in.append("911").append(NEW_LINE);
		in.append("97625999").append(NEW_LINE);
		in.append("91125426").append(NEW_LINE);
		in.append("5").append(NEW_LINE);
		in.append("113").append(NEW_LINE);
		in.append("12340").append(NEW_LINE);
		in.append("123440").append(NEW_LINE);
		in.append("12345").append(NEW_LINE);
		in.append("98346").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("NO").append(NEW_LINE);
		expected.append("YES");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return PhoneList.class;
	}

}
