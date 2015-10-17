import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class CarGameTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 3").append(NEW_LINE);
		in.append("banana").append(NEW_LINE);
		in.append("car").append(NEW_LINE);
		in.append("sand").append(NEW_LINE);
		in.append("uncharacteristically").append(NEW_LINE);
		in.append("counterrevolutionaries").append(NEW_LINE);
		in.append("RRR").append(NEW_LINE);
		in.append("DNA").append(NEW_LINE);
		in.append("SND").append(NEW_LINE);
		
		String out = execute(in);
		
		StringBuilder expected = new StringBuilder();
		expected.append("counterrevolutionaries").append(NEW_LINE);
		expected.append("No valid word").append(NEW_LINE);
		expected.append("sand");
		
		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return CarGame.class;
	}

}
