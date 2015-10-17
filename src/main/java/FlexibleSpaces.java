import java.util.Set;
import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/flexible
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class FlexibleSpaces {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int w = io.getInt();
		final int p = io.getInt();

		final int[] ps = new int[p + 2];

		for (int i = 1; i <= p; i++) {
			ps[i] = io.getInt();
		}
		ps[0] = 0;
		ps[p + 1] = w;

		final Set<Integer> sizes = new TreeSet<Integer>();

		for (int i = 0; i < ps.length; i++) {
			for (int j = i + 1; j < ps.length; j++) {
				sizes.add(ps[j] - ps[i]);
			}
		}

		for (final Integer s : sizes) {
			io.print(s);
			io.print(" ");
		}

		io.flush();
		io.close();
	}
}
