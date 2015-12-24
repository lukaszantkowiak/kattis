import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class FalseSenseOfSecurityTest extends AbstractTest {
	@Test
	public void testCase1() throws Exception {
		StringBuilder in = new StringBuilder();
		in.append("FENDSVTSLHW.EDATS,EULAY").append(NEW_LINE);
		in.append("TRDNWPLOEF").append(NEW_LINE);
		in.append("NTTTGAZEJUIIGDUZEHKUE").append(NEW_LINE);
		in.append("QEWOISE.EIVCAEFNRXTBELYTGD.").append(NEW_LINE);
		in.append("?EJHUT.TSMYGW?EJHOT").append(NEW_LINE);
		in.append("DSU.XFNCJEVE.OE_UJDXNO_YHU?VIDWDHPDJIKXZT?E").append(NEW_LINE);
		in.append("ADAWEKHZN,OTEATWRZMZN_IDWCZGTEPION").append(NEW_LINE);

		String out = execute(in);

		StringBuilder expected = new StringBuilder();
		expected.append("FALSE_SENSE_OF_SECURITY").append(NEW_LINE);
		expected.append("CTU_PRAGUE").append(NEW_LINE);
		expected.append("TWO_THOUSAND_THIRTEEN").append(NEW_LINE);
		expected.append("QUOTH_THE_RAVEN,_NEVERMORE.").append(NEW_LINE);
		expected.append("TO_BE_OR_NOT_TO_BE?").append(NEW_LINE);
		expected.append("THE_QUICK_BROWN_FOX_JUMPS_OVER_THE_LAZY_DOG").append(NEW_LINE);
		expected.append("ADAPTED_FROM_ACM_GREATER_NY_REGION");

		assertThat(out).isEqualTo(expected.toString());
	}

	@Override
	protected Class<?> getTestClass() {
		return FalseSenseOfSecurity.class;
	}

}
