import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AdministrativeDifficultiesTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1").append(NEW_LINE);
		in.append("2 8").append(NEW_LINE);
		in.append("bmw 5000 150 10").append(NEW_LINE);
		in.append("jaguar 7000 200 25").append(NEW_LINE);
		in.append("10 mallory p bmw").append(NEW_LINE);
		in.append("15 jb p jaguar").append(NEW_LINE);
		in.append("20 jb r 500").append(NEW_LINE);
		in.append("35 badluckbrian a 100").append(NEW_LINE);
		in.append("50 mallory a 10").append(NEW_LINE);
		in.append("55 silva p jaguar").append(NEW_LINE);
		in.append("60 mallory r 100").append(NEW_LINE);
		in.append("110 silva a 30").append(NEW_LINE);

		String os = execute(in);

		StringBuilder out = new StringBuilder();
		out.append("badluckbrian INCONSISTENT").append(NEW_LINE);
		out.append("jb 12700").append(NEW_LINE);
		out.append("mallory 1650").append(NEW_LINE);
		out.append("silva INCONSISTENT");
		
		Assertions.assertThat(os).isEqualTo(out.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return AdministrativeDifficulties.class;
	}
}
