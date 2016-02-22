
/**
 * Solution for https://open.kattis.com/problems/vauvau
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Vauvau {
	private static final String BOTH = "both";
	private static final String ONE = "one";
	private static final String NONE = "none";

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int a = io.getInt();
		int b = io.getInt();
		int c = io.getInt();
		int d = io.getInt();

		int p = io.getInt();
		int m = io.getInt();
		int g = io.getInt();

		io.println(calculateDogs(a, b, c, d, p));
		io.println(calculateDogs(a, b, c, d, m));
		io.println(calculateDogs(a, b, c, d, g));

		io.flush();
		io.close();
	}

	private static String calculateDogs(int a, int b, int c, int d, int p) {
		boolean d1 = isAggresive(a, b, p);
		boolean d2 = isAggresive(c, d, p);

		if (d1 && d2) {
			return BOTH;
		} else if (d1 || d2) {
			return ONE;
		}
		return NONE;
	}

	private static boolean isAggresive(int a, int b, int p) {
		int q = (p % (a + b));
		return q <= a && q > 0;
	}
}
