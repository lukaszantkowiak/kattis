import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;



public class EngineeringEnglishTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("Engineering will save the world from inefficiency").append(NEW_LINE);
		in.append("Inefficiency is a blight on the world and its").append(NEW_LINE);
		in.append("humanity").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("Engineering will save the world from inefficiency").append(NEW_LINE);
		expected.append(". is a blight on . . and its").append(NEW_LINE);
		expected.append("humanity");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("he said that that that that that man used").append(NEW_LINE);
		in.append("was wrong").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("he said that . . . . man used").append(NEW_LINE);
		expected.append("was wrong");
		
		assertThat(out).isEqualTo(expected.toString());
	}
	
	@Override
	protected Class<?> getTestClass() {
		return EngineeringEnglish.class;
	}

}
