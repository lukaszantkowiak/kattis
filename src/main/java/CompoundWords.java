import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/compoundwords
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class CompoundWords {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final List<String> words = new ArrayList<String>();
		while (io.hasMoreTokens()) {
			words.add(io.getWord());
		}

		final Set<String> result = new TreeSet<String>();
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if (i != j) {
					result.add(words.get(i) + words.get(j));
					result.add(words.get(j) + words.get(i));
				}
			}
		}

		for (final String world : result) {
			io.println(world);
		}

		io.flush();
		io.close();
	}

}
