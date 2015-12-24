import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SecretMessageTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("iloveyoutooJill").append(NEW_LINE);
		in.append("TheContestisOver").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("iteiloylloooJuv").append(NEW_LINE);
		expected.append("OsoTvtnheiterseC");
		
		Assertions.assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return SecretMessage.class;
	}

}
