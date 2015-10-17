/**
 * Solution for https://open.kattis.com/problems/cargame
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class CarGame {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();
		final int m = io.getInt();

		final String[] dictionary = new String[n];
		for (int i = 0; i < n; i++) {
			dictionary[i] = io.getWord();
		}

		for (int i = 0; i < m; i++) {
			final char[] plate = io.getWord().toLowerCase().toCharArray();

			boolean suc = false;
			for (int j = 0; j < n; j++) {
				final int s1 = dictionary[j].indexOf(plate[0]);
				final int s2 = dictionary[j].indexOf(plate[1], s1 + 1);
				final int s3 = dictionary[j].indexOf(plate[2], s2 + 1);
				if (s1 > -1 && s1 < s2 && s2 < s3) {
					io.println(dictionary[j]);
					suc = true;
					break;
				}
			}
			if (!suc) {
				io.println("No valid word");
			}
		}

		io.flush();
		io.close();
	}

}
