/**
 * Solution for https://open.kattis.com/problems/prsteni
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Prsteni {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final int first = io.getInt();

		for (int i = 1; i < n; i++) {
			final int r = io.getInt();

			io.println(asFraction(first, r));
		}

		io.flush();
		io.close();
	}

	private static long gcm(final int a, final int b) {
		return b == 0 ? a : gcm(b, a % b);
	}

	private static String asFraction(final int a, final int b) {
		final long gcm = gcm(a, b);
		return (a / gcm) + "/" + (b / gcm);
	}

}
