import static org.assertj.core.api.StrictAssertions.assertThat;

import org.assertj.core.data.Offset;
import org.junit.Test;

public class EstimatingTheAreaOfACircleTest extends AbstractTest {
	
	private static final Offset<Double> OFFSET = Offset.offset(Math.pow(10, -5));

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("1.0 100 75").append(NEW_LINE);
		in.append("10.0 5000 4023").append(NEW_LINE);
		in.append("3.0 21 17").append(NEW_LINE);
		in.append("0 0 0").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("3.141592654 3").append(NEW_LINE);
		expected.append("314.1592654 321.84").append(NEW_LINE);
		expected.append("28.27433388 29.14285714");

		String lines[] = out.split(NEW_LINE);
		String result1[] = lines[0].split(" ");
		String result2[] = lines[1].split(" ");
		String result3[] = lines[2].split(" ");

		assertThat(Double.parseDouble(result1[0])).isEqualTo(3.141592654, OFFSET);
		assertThat(Double.parseDouble(result1[1])).isEqualTo(3, OFFSET);

		assertThat(Double.parseDouble(result2[0])).isEqualTo(314.1592654, OFFSET);
		assertThat(Double.parseDouble(result2[1])).isEqualTo(321.84, OFFSET);

		assertThat(Double.parseDouble(result3[0])).isEqualTo(28.27433388, OFFSET);
		assertThat(Double.parseDouble(result3[1])).isEqualTo(29.14285714, OFFSET);
	}

	@Override
	protected Class<?> getTestClass() {
		return EstimatingTheAreaOfACircle.class;
	}

}
