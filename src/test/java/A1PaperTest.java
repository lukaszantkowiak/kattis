import java.io.OutputStream;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.Test;

public class A1PaperTest extends AbstractTest{

	private static final Offset<Double> EPS = Offset.offset(1e-5);

	@Test
	public void testCase1()  throws Exception{
		StringBuilder in = new StringBuilder();
		in.append("4").append(NEW_LINE);
		in.append("1 0 5");

		OutputStream os = execute(in);

		double result = Double.parseDouble(os.toString().trim());
		double expected = 1.60965532263;

		Assertions.assertThat(result).isEqualTo(expected, EPS);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3").append(NEW_LINE);
		in.append("0 3");

		OutputStream os = execute(in);

		String result = os.toString().trim();
		String expected = "impossible";

		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Override
	protected Class<?> getTestClass() {
		return A1Paper.class;
	}
}
