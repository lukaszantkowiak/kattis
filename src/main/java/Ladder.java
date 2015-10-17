/**
 * Solution for https://open.kattis.com/problems/ladder
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Ladder {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int h = io.getInt();
		final int v = io.getInt();

		final double rad = (v * (Math.PI / 180.0));

		io.println((int) Math.ceil(h / Math.sin(rad)));

		io.flush();
		io.close();
	}
}
