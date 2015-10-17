/**
 * Solution for https://open.kattis.com/problems/mixedfractions
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class MixedFractions {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		while (true) {
			final int numerator = io.getInt();
			final int denominator = io.getInt();

			if (numerator == 0 && denominator == 0) {
				break;
			}

			final int r = numerator / denominator;
			final int mod = numerator % denominator;

			io.println(r + " " + mod + " / " + denominator);
		}

		io.flush();
		io.close();
	}
}
