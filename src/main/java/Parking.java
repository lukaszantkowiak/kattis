import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/parking
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Parking {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final Map<Integer, Integer> prices = new HashMap<Integer, Integer>();

		prices.put(0, 0);
		prices.put(1, io.getInt());
		prices.put(2, io.getInt());
		prices.put(3, io.getInt());

		final boolean[][] intervals = new boolean[3][101];

		for (int i = 0; i < 3; i++) {
			final int s = io.getInt();
			final int e = io.getInt();

			for (int j = s; j < e; j++) {
				intervals[i][j] = true;
			}
		}

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			int n = 0;

			for (int j = 0; j < 3; j++) {
				if (intervals[j][i]) {
					n++;
				}
			}
			sum += n * prices.get(n);

		}

		io.println(sum);

		io.flush();
		io.close();
	}

}
