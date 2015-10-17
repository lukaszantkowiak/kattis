import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/blackfriday
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class BlackFriday {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final Map<Integer, Integer> results = new LinkedHashMap<Integer, Integer>();

		final List<Integer> all = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			final Integer r = io.getInt();
			all.add(r);
			if (results.containsKey(r)) {
				results.put(r, results.get(r) + 1);
			} else {
				results.put(r, 1);
			}
		}

		int max = -1;

		for (final Map.Entry<Integer, Integer> entry : results.entrySet()) {
			if (entry.getValue() == 1 && entry.getKey() > max) {
				max = entry.getKey();
			}
		}

		if (max == -1) {
			io.println("none");
		} else {
			io.println(all.indexOf(max) + 1);
		}

		io.flush();
		io.close();
	}
}
