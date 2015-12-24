/**
 * Solution for https://open.kattis.com/problems/apaxiaaans
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Apaxiaaaaaaaaaaaans {

	public static void main(String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		char[] name = io.getWord().toCharArray();

		StringBuilder result = new StringBuilder();
		char prev = ' ';

		for (char c : name) {
			if (prev != c) {
				result.append(c);
				prev = c;
			}
		}

		io.println(result);

		io.flush();
		io.close();
	}

}
