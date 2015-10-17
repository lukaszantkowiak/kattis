import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/peragrams
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Peragrams {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final String word = io.getWord();

		final Map<Character, Integer> chars = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			final Character c = word.charAt(i);

			if (chars.containsKey(c)) {
				chars.put(c, chars.get(c) + 1);
			} else {
				chars.put(c, 1);
			}
		}

		int odds = 0;

		for (final Integer i : chars.values()) {
			if (i % 2 == 1) {
				odds++;
			}
		}

		if (odds > 1) {
			io.println(odds - 1);
		} else {
			io.println(0);
		}

		io.flush();
		io.close();
	}
}
