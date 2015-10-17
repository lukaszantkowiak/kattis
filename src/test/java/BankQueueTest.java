import static org.assertj.core.api.StrictAssertions.assertThat;

import java.io.OutputStream;

import org.junit.Test;

public class BankQueueTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("4 4").append(NEW_LINE);
		in.append("1000 1").append(NEW_LINE);
		in.append("2000 2").append(NEW_LINE);
		in.append("500 2").append(NEW_LINE);
		in.append("1200 0").append(NEW_LINE);

		OutputStream os = execute(in);

		assertThat(Integer.parseInt(os.toString())).isEqualTo(4200);
	}

	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("3 4").append(NEW_LINE);
		in.append("1000 0").append(NEW_LINE);
		in.append("2000 1").append(NEW_LINE);
		in.append("500 1").append(NEW_LINE);

		OutputStream os = execute(in);

		assertThat(Integer.parseInt(os.toString())).isEqualTo(3000);
	}

	@Override
	protected Class<?> getTestClass() {
		return BankQueue.class;
	}

}
