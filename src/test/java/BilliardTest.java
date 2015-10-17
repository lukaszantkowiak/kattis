import static org.assertj.core.api.StrictAssertions.assertThat;

import java.io.OutputStream;

import org.assertj.core.data.Offset;
import org.junit.Test;

public class BilliardTest extends AbstractTest {

	private static final Offset<Double> EPS = Offset.offset(1e-30);

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("100 100 1 1 1").append(NEW_LINE);
		in.append("200 100 5 3 4").append(NEW_LINE);
		in.append("201 132 48 1900 156").append(NEW_LINE);
		in.append("0 0 0 0 0").append(NEW_LINE);
		
		OutputStream os = execute(in);
		
		String[] results = os.toString().split(NEW_LINE);
		
		assertThat(results).hasSize(3);
		String[] line1 = results[0].split(" ");
		assertThat(Double.parseDouble(line1[0])).isEqualTo(45.00, EPS);
		assertThat(Double.parseDouble(line1[2])).isEqualTo(141.42, EPS);
		String[] line2 = results[1].split(" ");
		assertThat(Double.parseDouble(line2[0])).isEqualTo(33.69, EPS);
		assertThat(Double.parseDouble(line2[2])).isEqualTo(144.22, EPS);
		String[] line3 = results[2].split(" ");
		assertThat(Double.parseDouble(line3[0])).isEqualTo(3.09, EPS);
		assertThat(Double.parseDouble(line3[2])).isEqualTo(7967.81, EPS);
	}

	@Override
	protected Class<?> getTestClass() {
		return Billiard.class;
	}

}
