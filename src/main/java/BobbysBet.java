/**
 * Solution for https://open.kattis.com/problems/bobby
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class BobbysBet {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();

		for (int i = 0; i < n; i++) {
			int r = io.getInt();
			int s = io.getInt();
			int x = io.getInt();
			int y = io.getInt();
			int w = io.getInt();

			double p = (1.0 * s - r + 1) / s;
			double q = 1.0 - p;

			double sum = 0.0;

			for (int j = x; j <= y; j++) {
				sum += binomialCoefficient(y, j) * Math.pow(p, j) * Math.pow(q, y - j);
			}

			if (sum * w > 1) {
				io.println("yes");
			} else {
				io.println("no");
			}
		}

		io.flush();
		io.close();
	}

	private static int binomialCoefficient(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

	private static int factorial(int n) {
		if (n < 2) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
