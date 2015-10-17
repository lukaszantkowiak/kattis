/**
 * Solution for https://open.kattis.com/problems/easiest
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class TheEasiestProblemIsThisOne {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int n;

		while ((n = io.getInt()) != 0) {
			int p = 11;
			final int ns = sumDigits(n);

			while (true) {
				if (ns == sumDigits(n * p)) {
					io.println(p);
					break;
				}
				p++;
			}
		}

		io.flush();
		io.close();
	}

	private static int sumDigits(int n) {
		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
