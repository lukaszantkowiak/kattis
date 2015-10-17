/**
 * Solution for https://open.kattis.com/problems/pauleigon
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class PaulEigon {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final long n = io.getLong();
		final long ps = io.getLong() + io.getLong() + n + n;

		final long changes = ps / n;

		io.println(changes % 2 == 0 ? "paul" : "opponent");

		io.flush();
		io.close();
	}
}
