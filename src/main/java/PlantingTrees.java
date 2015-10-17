import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/plantingtrees
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class PlantingTrees {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		int days = 0;

		final List<Integer> times = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			times.add(io.getInt());
		}

		Collections.sort(times);
		Collections.reverse(times);

		for (int i = 0; i < n; i++) {
			final int t = i + times.get(i) + 1;
			if (t > days) {
				days = t;
			}
		}

		io.println(days + 1);

		io.flush();
		io.close();
	}

}
