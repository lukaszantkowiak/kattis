/**
 * Solution for https://open.kattis.com/problems/tri
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Tri {
	private static final char[] OPS = { '*', '/', '+', '-' };

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int a = io.getInt();
		final int b = io.getInt();
		final int c = io.getInt();

		for (final char o : OPS) {
			if (op(a, o, b) == c) {
				io.println(a + (o + "") + b + "=" + c);
				break;
			}
			if (a == op(b, o, c)) {
				io.println(a + "=" + b + (o + "") + c);
				break;
			}
		}

		io.flush();
		io.close();
	}

	private static int op(final int a, final char o, final int b) {
		switch (o) {
		case '*':
			return a * b;
		case '/':
			if (b == 0) {
				return -2000;
			}
			return a / b;
		case '+':
			return a + b;
		case '-':
			return a - b;
		}

		throw new IllegalArgumentException("wrong operator");
	}

}
