import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/4thought
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class FourThought {
	private static final char[] ops = { '*', '+', '-', '/' };

	private static final Map<Integer, String> RESULTS = new HashMap<Integer, String>();

	static {
		for (final char o1 : ops) {
			for (final char o2 : ops) {
				for (final char o3 : ops) {
					final String exp = "4 " + o1 + " 4 " + o2 + " 4 " + o3 + " 4";

					int result = 0;
					if (!f(o1) && f(o2) && f(o3)) {
						result = op(4, o1, op(op(4, o2, 4), o3, 4));
					} else if (!f(o2) && f(o3)) {
						result = op(op(4, o1, 4), o2, op(4, o3, 4));
					} else if (!f(o1) && f(o2) && !f(o3)) {
						result = op(op(4, o1, op(4, o2, 4)), o3, 4);
					} else {
						result = op(op(op(4, o1, 4), o2, 4), o3, 4);
					}

					if (!RESULTS.containsKey(result)) {
						RESULTS.put(result, exp);
					}
				}
			}
		}
	}

	private static boolean f(final char o) {
		return o == '*' || o == '/';
	}

	private static int op(final int a, final char o, final int b) {
		switch (o) {
		case '*':
			return a * b;
		case '/':
			if (b == 0) {
				return -1000001;
			}
			return a / b;
		case '+':
			return a + b;
		case '-':
			return a - b;
		}

		throw new IllegalArgumentException("wrong operator");
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int m = io.getInt();

		for (int i = 0; i < m; i++) {
			final int n = io.getInt();
			final String r = RESULTS.get(n);
			if (r != null) {
				io.println(r + " = " + n);
			} else {
				io.println("no solution");
			}
		}

		io.flush();
		io.close();
	}
}
