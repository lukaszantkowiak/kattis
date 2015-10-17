/**
 * Solution for https://open.kattis.com/problems/pet
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Pet {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int player = 0;
		int max = -1;

		for (int i = 1; i <= 5; i++) {
			final int p = io.getInt() + io.getInt() + io.getInt() + io.getInt();
			if (p > max) {
				max = p;
				player = i;
			}
		}

		io.println(player + " " + max);

		io.flush();
		io.close();
	}

}
