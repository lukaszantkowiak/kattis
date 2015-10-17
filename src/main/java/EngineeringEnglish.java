import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Solution for https://open.kattis.com/problems/engineeringenglish
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class EngineeringEnglish {
	private static Set<String> WORDS = new IgnoreCaseStringSet();

	public static void main(final String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while ((line = br.readLine()) != null && !line.equals("")) {
			proceed(line);
		}

	}

	private static void proceed(final String line) {
		final String[] words = line.split(" ");
		final StringBuilder sb = new StringBuilder();
		for (final String word : words) {
			if (WORDS.contains(word)) {
				sb.append(".");
			} else {
				WORDS.add(word);
				sb.append(word);
			}
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
	}

	private static class IgnoreCaseStringSet extends HashSet<String> {
		private static final long serialVersionUID = 8654959810732821241L;

		@Override
		public boolean add(final String e) {
			return super.add(e.toLowerCase());
		}

		@Override
		public boolean contains(final Object o) {
			return super.contains(o.toString().toLowerCase());
		}
	}
}
