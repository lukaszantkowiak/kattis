/**
 * Solution for https://open.kattis.com/problems/conundrum
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class CryptographersConundrum {
	private static final char[] PER = "per".toCharArray();

	public static void main(String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int changes = 0;
		char[] text = io.getWord().toLowerCase().toCharArray();

		for (int i = 0; i < text.length; i++) {
			if (text[i] != PER[i % 3]) {
				changes++;
			}
		}

		io.println(changes);

		io.flush();
		io.close();
	}
}
