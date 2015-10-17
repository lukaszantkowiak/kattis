import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/kemija08
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Kemija08 {
	private static final Map<String, String> REPLACES = new HashMap<String, String>();

	static {
		REPLACES.put("apa", "a");
		REPLACES.put("epe", "e");
		REPLACES.put("ipi", "i");
		REPLACES.put("opo", "o");
		REPLACES.put("upu", "u");
	}

	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine();
		for (final Map.Entry<String, String> entry : REPLACES.entrySet()) {
			line = line.replaceAll(entry.getKey(), entry.getValue());
		}

		System.out.println(line);
	}
}
