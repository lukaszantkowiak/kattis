/**
 * Solution for https://open.kattis.com/problems/maxloot
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class MaximumLoot {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int t = io.getInt();

		for (int i = 0; i < t; i++) {
			int n = io.getInt();
			int c = io.getInt();

			int[] values = new int[n];
			for (int j = 0; j < n; j++) {
				values[j] = io.getInt();
			}

			int[] weights = new int[n];
			for (int j = 0; j < n; j++) {
				weights[j] = io.getInt();
			}

			io.println(knapSack(c, weights, values, n));
		}

		io.flush();
		io.close();
	}

	private static int knapSack(int c, int[] weights, int[] values, int n) {
		int b[] = new int[c + 1];
		int max = 0;

		b[0] = 0;
		for (int i = 1; i < c + 1; i++) {
			b[i] = -1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = c; j >= 0; j--) {
				if (!(j - weights[i] < 0) && !(b[j - weights[i]] < 0)) {
					b[j] = Math.max(b[j - weights[i]] + values[i], b[j]);
					if (b[j] > max) {
						max = b[j];
					}
				}
			}
		}

		return max;
	}
}
