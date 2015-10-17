import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/babelfish
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Babelfish {
	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final Map<String, String> dict = new HashMap<String, String>();

		String line;
		while ((line = reader.readLine()).length() > 0) {
			final String[] w = line.split(" ");
			dict.put(w[1], w[0]);
		}

		while ((line = reader.readLine()) != null) {
			if (dict.containsKey(line)) {
				System.out.println(dict.get(line));
			} else {
				System.out.println("eh");
			}
		}
	}

}
