import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class PetTest extends AbstractTest {
	
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("5 4 4 5").append(NEW_LINE);
		in.append("5 4 4 4").append(NEW_LINE);
		in.append("5 5 4 4").append(NEW_LINE);
		in.append("5 5 5 4").append(NEW_LINE);
		in.append("4 4 4 5").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("4 19");
	}
	
	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 4 3 3").append(NEW_LINE);
		in.append("5 4 3 5").append(NEW_LINE);
		in.append("5 5 2 4").append(NEW_LINE);
		in.append("5 5 5 1").append(NEW_LINE);
		in.append("4 4 4 4").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(out).isEqualTo("2 17");
	}
	
	@Override
	protected Class<?> getTestClass() {
		return Pet.class;
	}

}
