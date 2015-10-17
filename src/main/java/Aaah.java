/**
 * Solution for https://open.kattis.com/problems/aaah
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Aaah {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		if (io.getWord().length() >= io.getWord().length()) {
			io.println("go");
		} else {
			io.println("no");
		}

		io.flush();
		io.close();
	}

}
