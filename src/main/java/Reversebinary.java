import java.io.IOException;

/**
 * Solution for https://open.kattis.com/problems/reversebinary
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Reversebinary {
	private final int value;

	public Reversebinary(final int value) {
		this.value = value;
	}

	public int reverse() {
		return Integer.parseInt(new StringBuilder(Integer.toBinaryString(this.value)).reverse().toString(), 2);
	}

	public static void main(final String[] args) throws IOException {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final Reversebinary reversebinary = new Reversebinary(n);

		io.println(reversebinary.reverse());

		io.flush();
		io.close();
	}
}
