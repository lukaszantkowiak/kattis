/**
 * Solution for https://open.kattis.com/problems/billiard
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Billiard {
	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		while (true) {
			final int a = io.getInt();
			final int b = io.getInt();
			final int s = io.getInt();
			final int m = io.getInt();
			final int n = io.getInt();

			if (s == 0) {
				break;
			}

			final double aSide = a * m;
			final double bSide = b * n;
			final double cSide = Math.sqrt(aSide * aSide + bSide * bSide);

			final double angle = Math.toDegrees(Math.acos(aSide / cSide));

			io.println(String.format("%.2f ", angle) + " " + String.format("%.2f ", cSide / s));
		}

		io.flush();
		io.close();
	}

}
