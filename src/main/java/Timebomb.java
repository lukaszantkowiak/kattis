import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/timebomb
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Timebomb {
	private static final String _0 = "**** ** ** ****";
	private static final String _1 = "  *  *  *  *  *";
	private static final String _2 = "***  *****  ***";
	private static final String _3 = "***  ****  ****";
	private static final String _4 = "* ** ****  *  *";
	private static final String _5 = "****  ***  ****";
	private static final String _6 = "****  **** ****";
	private static final String _7 = "***  *  *  *  *";
	private static final String _8 = "**** ***** ****";
	private static final String _9 = "**** ****  ****";

	private static final Map<String, Integer> DIGITS = new HashMap<String, Integer>();

	static {
		DIGITS.put(_0, 0);
		DIGITS.put(_1, 1);
		DIGITS.put(_2, 2);
		DIGITS.put(_3, 3);
		DIGITS.put(_4, 4);
		DIGITS.put(_5, 5);
		DIGITS.put(_6, 6);
		DIGITS.put(_7, 7);
		DIGITS.put(_8, 8);
		DIGITS.put(_9, 9);
	}

	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final String[] lines = new String[5];
		for (int i = 0; i < 5; i++) {
			lines[i] = reader.readLine();
		}

		final int length = lines[0].length();

		final StringBuilder code = new StringBuilder();

		for (int i = 0; i < length; i += 4) {
			final StringBuilder digit = new StringBuilder();
			for (int j = 0; j < 5; j++) {
				digit.append(lines[j].substring(i, i + 3));
			}

			if (!DIGITS.containsKey(digit.toString())) {
				System.out.println("BOOM!!");
				return;
			} else {
				code.append(DIGITS.get(digit.toString()));
			}
		}
		if (Integer.parseInt(code.toString()) % 6 == 0) {
			System.out.println("BEER!!");
		} else {
			System.out.println("BOOM!!");
		}
	}
}
