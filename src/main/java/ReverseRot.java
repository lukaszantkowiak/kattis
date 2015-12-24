/**
 * Solution for https://open.kattis.com/problems/reverserot
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ReverseRot {
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
	private static final char[] CHARS_ARR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
	private static final int LENGTH = CHARS.length();

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n;

		while ((n = io.getInt()) != 0) {
			String word = new StringBuilder(io.getWord()).reverse().toString();

			StringBuilder result = new StringBuilder();

			for (char c : word.toCharArray()) {
				int i = CHARS.indexOf(c) + n;
				result.append(CHARS_ARR[i % LENGTH]);
			}

			io.println(result);
		}

		io.flush();
		io.close();
	}
}
