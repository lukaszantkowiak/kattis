/**
 * Solution for https://open.kattis.com/problems/alphabetspam
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class AlphabetSpam {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final String word = io.getWord();

		int w = 0;
		int l = 0;
		int u = 0;
		int s = 0;

		for (int i = 0; i < word.length(); i++) {
			final char c = word.charAt(i);

			if (c == '_') {
				w++;
			} else if (c >= 'a' && c <= 'z') {
				l++;
			} else if (c >= 'A' && c <= 'Z') {
				u++;
			} else {
				s++;
			}
		}

		final double sum = w + l + u + s;

		io.println(w / sum);
		io.println(l / sum);
		io.println(u / sum);
		io.println(s / sum);

		io.flush();
		io.close();
	}

}
