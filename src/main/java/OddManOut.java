import java.util.LinkedList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/oddmanout
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class OddManOut {
	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		for (int i = 0; i < n; i++) {
			final int g = io.getInt();

			final List<Integer> guests = new LinkedList<Integer>();

			for (int j = 0; j < g; j++) {
				final Integer c = io.getInt();

				if (guests.contains(c)) {
					guests.remove(c);
				} else {
					guests.add(c);
				}
			}
			io.println("Case #" + (i + 1) + ": " + guests.get(0));
		}

		io.flush();
		io.close();
	}
}
