/**
 * Solution for https://open.kattis.com/problems/dicegame
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Dicegame {
	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final double gd = calculateP(io.getDouble(), io.getDouble()) + calculateP(io.getDouble(), io.getDouble());
		final double ed = calculateP(io.getDouble(), io.getDouble()) + calculateP(io.getDouble(), io.getDouble());

		if (gd == ed) {
			io.write("Tie");
		} else if (gd > ed) {
			io.write("Gunnar");
		} else {
			io.write("Emma");
		}

		io.close();
	}

	private static double calculateP(final double a, final double b) {
		return (a + b) / 2;
	}
}
