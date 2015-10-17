import static org.assertj.core.api.Assertions.assertThat;

import java.io.OutputStream;

import org.assertj.core.data.Offset;
import org.junit.Test;

public class AlphabetSpamTest extends AbstractTest {
	private static final Offset<Double> EPS = Offset.offset(1e-6);
	
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("Welcome_NWERC_participants!").append(NEW_LINE);
		
		OutputStream os = execute(in);
		String[] results = os.toString().split(NEW_LINE);

		assertThat(results).hasSize(4);
		assertThat(Double.parseDouble(results[0])).isEqualTo(0.0740740740740741, EPS);
		assertThat(Double.parseDouble(results[1])).isEqualTo(0.666666666666667, EPS);
		assertThat(Double.parseDouble(results[2])).isEqualTo(0.222222222222222, EPS);
		assertThat(Double.parseDouble(results[3])).isEqualTo(0.0370370370370370, EPS);
	}
	
	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("\\/\\/in_US$100000_in_our_Ca$h_Lo||ery!!!").append(NEW_LINE);
		
		OutputStream os = execute(in);
		String[] results = os.toString().split(NEW_LINE);

		assertThat(results).hasSize(4);
		assertThat(Double.parseDouble(results[0])).isEqualTo(0.128205128205128, EPS);
		assertThat(Double.parseDouble(results[1])).isEqualTo(0.333333333333333, EPS);
		assertThat(Double.parseDouble(results[2])).isEqualTo(0.102564102564103, EPS);
		assertThat(Double.parseDouble(results[3])).isEqualTo(0.435897435897436, EPS);
	}

	@Override
	protected Class<?> getTestClass() {
		return AlphabetSpam.class;
	}
}
