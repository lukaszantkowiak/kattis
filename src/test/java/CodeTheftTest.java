import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.io.OutputStream;

import org.junit.Test;



public class CodeTheftTest extends AbstractTest {

	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("HelloWorld.c").append(NEW_LINE);
		in.append("int Main() {").append(NEW_LINE);
		in.append("    printf(\"Hello %d\\n\",i);").append(NEW_LINE);
		in.append("}").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		in.append("Add.c").append(NEW_LINE);
		in.append("int Main() {").append(NEW_LINE);
		in.append("  for (int i=0; i<10; i++)").append(NEW_LINE);
		in.append("    sum += i;").append(NEW_LINE);
		in.append("  printf(\"SUM %d\", sum);").append(NEW_LINE);
		in.append("}").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		in.append("int Main() {").append(NEW_LINE);
		in.append("  printf(\"Hello %d\\n\",i);").append(NEW_LINE);
		in.append("  printf(\"THE END\\n\");").append(NEW_LINE);
		in.append("}").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		
		OutputStream out = execute(in);
		
		assertThat(out.toString()).isEqualTo("2 HelloWorld.c");
	}
	
	@Test
	public void testCase2() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("2").append(NEW_LINE);
		in.append("HelloWorld1.bas").append(NEW_LINE);
		in.append("10 PRINT \"*******************\"").append(NEW_LINE);
		in.append("20 PRINT \"*******************\"").append(NEW_LINE);
		in.append("30 PRINT \"--- HELLO WORLD ---\"").append(NEW_LINE);
		in.append("40 PRINT \"*******************\"").append(NEW_LINE);
		in.append("50 PRINT \"*******************\"").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		in.append("HelloWorld2.bas").append(NEW_LINE);
		in.append("10  PRINT   \"-------------------\"").append(NEW_LINE);
		in.append("20  PRINT   \"*******************\"").append(NEW_LINE);
		in.append("30  PRINT   \"--- HELLO WORLD ---\"").append(NEW_LINE);
		in.append("40  PRINT   \"*******************\"").append(NEW_LINE);
		in.append("50  PRINT   \"-------------------\"").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		in.append("10 REM Hello ver 1.0 (c) Acme 2008").append(NEW_LINE);
		in.append("20 PRINT \"*******************\"").append(NEW_LINE);
		in.append("30 PRINT \"--- HELLO WORLD ---\"").append(NEW_LINE);
		in.append("40 PRINT \"*******************\"").append(NEW_LINE);
		in.append("50 END").append(NEW_LINE);
		in.append("***END***").append(NEW_LINE);
		
		OutputStream out = execute(in);
		
		assertThat(out.toString()).isEqualTo("3 HelloWorld1.bas HelloWorld2.bas");
	}
	
	@Override
	protected Class<?> getTestClass() {
		return CodeTheft.class;
	}

}
