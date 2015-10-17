/**
 * Solution for https://open.kattis.com/problems/virus
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class VirusReplication {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final String before = io.getWord();
		final String after = io.getWord();

		int start = 0;
		int end = 0;

		for (int i = 0; i < before.length(); i++) {
			if (i >= after.length()) {
				break;
			}
			if (before.charAt(i) != after.charAt(i)) {
				start = i;
				break;
			}
		}

		int ai = after.length() - 1;

		for (int i = before.length() - 1; i >= 0; i--) {
			if (ai < 0) {
				break;
			}
			if (before.charAt(i) != after.charAt(ai--)) {
				end = ai + 1;
				break;
			}
		}

		if (end == 0 && start == 0 && after.length() != before.length()) {
			io.println(Math.max(after.length() - before.length(), 0));
		} else if (end - start < 0 || (end == 0 && start == 0)) {
			io.println(0);
		} else {
			io.println(end - start + 1);
		}

		io.flush();
		io.close();
	}
}
