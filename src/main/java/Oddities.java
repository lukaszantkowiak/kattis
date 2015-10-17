/**
 * Solution for https://open.kattis.com/problems/oddities
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Oddities {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		for (int i = 0; i < n; i++) {
			final int x = io.getInt();
			if (x % 2 == 0) {
				io.println(x + " is even");
			} else {
				io.println(x + " is odd");
			}
		}

		io.flush();
		io.close();
	}

}
