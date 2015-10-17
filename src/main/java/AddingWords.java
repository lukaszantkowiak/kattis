import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/addingwords
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class AddingWords {
	private static final String DEF = "def";
	private static final String CALC = "calc";
	private static final String UNKNOWN = "unknown";
	private static final String CLEAR = "clear";

	private final Map<Integer, String> valueWord;
	private final Map<String, Integer> wordValue;

	public AddingWords(final Map<Integer, String> valueWord, final Map<String, Integer> wordValue) {
		this.valueWord = valueWord;
		this.wordValue = wordValue;
	}

	private String calc(final String[] tokens) {
		int result = 0;
		char operation = '+';

		for (int i = 1; i < tokens.length - 1; i++) {
			if (i % 2 == 0) {
				operation = tokens[i].charAt(0);
			} else {
				final Integer var = this.wordValue.get(tokens[i]);

				if (var == null) {
					return UNKNOWN;
				}

				switch (operation) {
				case '+':
					result += var;
					break;
				case '-':
					result -= var;
					break;
				}
			}
		}

		final String res = this.valueWord.get(result);

		return res != null ? res : UNKNOWN;
	}

	private void add(final String word, final int value) {
		this.valueWord.remove(this.wordValue.get(word));
		this.valueWord.put(value, word);
		this.wordValue.put(word, value);
	}

	public static void main(final String[] args) throws NumberFormatException, IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final Map<Integer, String> valueWord = new HashMap<Integer, String>();
		final Map<String, Integer> wordValue = new HashMap<String, Integer>();

		final AddingWords addingWords = new AddingWords(valueWord, wordValue);

		String line;

		while ((line = reader.readLine()) != null) {
			final String[] tokens = line.split(" ");

			if (tokens[0].equals(DEF)) {
				final String word = tokens[1];
				final int value = Integer.parseInt(tokens[2].trim());

				addingWords.add(word, value);

			} else if (tokens[0].equals(CALC)) {
				System.out.println(line.substring(5) + " " + addingWords.calc(tokens));
			} else if (tokens[0].equals(CLEAR)) {
				valueWord.clear();
				wordValue.clear();
			}
		}

	}

}
