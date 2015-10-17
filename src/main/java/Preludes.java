import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/chopin
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Preludes {
	private static final Map<String, String> ALTERNATIVES = new HashMap<String, String>();

	static {
		ALTERNATIVES.put("A#", "Bb");
		ALTERNATIVES.put("C#", "Db");
		ALTERNATIVES.put("D#", "Eb");
		ALTERNATIVES.put("F#", "Gb");
		ALTERNATIVES.put("G#", "Ab");
		ALTERNATIVES.put("Bb", "A#");
		ALTERNATIVES.put("Db", "C#");
		ALTERNATIVES.put("Eb", "D#");
		ALTERNATIVES.put("Gb", "F#");
		ALTERNATIVES.put("Ab", "G#");
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int t = 1;
		while (io.hasMoreTokens()) {
			final String key = io.getWord();
			final String tone = io.getWord();

			io.print("Case " + t + ": ");
			if (ALTERNATIVES.containsKey(key)) {
				io.println(ALTERNATIVES.get(key) + " " + tone);
			} else {
				io.println("UNIQUE");
			}

			t++;
		}

		io.flush();
		io.close();
	}

}
