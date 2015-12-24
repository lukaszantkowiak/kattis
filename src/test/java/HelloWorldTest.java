import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class HelloWorldTest extends AbstractTest {

	@Test
	public void testCase() throws Exception {
		String out = execute(new StringBuilder());

		assertThat(out).isEqualTo("Hello World!");
	}
	
	@Override
	protected Class<?> getTestClass() {
		return HelloWorld.class;
	}

}
