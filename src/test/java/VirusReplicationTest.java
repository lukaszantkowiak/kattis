import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class VirusReplicationTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("AAAAA").append(NEW_LINE);
		in.append("AGCGAA").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(Integer.parseInt(out)).isEqualTo(3);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("GTTTGACACACATT").append(NEW_LINE);
		in.append("GTTTGACCACAT").append(NEW_LINE);
		
		String out = execute(in);
		
		assertThat(Integer.parseInt(out)).isEqualTo(4);
	}
	
	@Override
	protected Class<?> getTestClass() {
		return VirusReplication.class;
	}

}
