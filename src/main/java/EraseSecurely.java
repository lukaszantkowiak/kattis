/**
 * Solution for https://open.kattis.com/problems/erase
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class EraseSecurely {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final String w1 = io.getWord();
		final String w2 = io.getWord();

		if (n % 2 == 0) {
			if (w1.equals(w2)) {
				io.println("Deletion succeeded");
			} else {
				io.println("Deletion failed");
			}
		} else {
			for (int i = 0; i < w1.length(); i++) {
				if (w1.charAt(i) == w2.charAt(i)) {
					io.println("Deletion failed");
					io.flush();
					io.close();
					return;
				}
			}
			io.println("Deletion succeeded");
		}

		io.flush();
		io.close();
	}

}
