import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution for https://open.kattis.com/problems/quickbrownfox
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class QuickBrownFox {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			boolean[] all = new boolean[26];

			String sentence = reader.readLine();
			for (int j = 0; j < sentence.length(); j++) {
				char c = sentence.charAt(j);
				if (c >= 65 && c <= 90) {
					all[c - 65] = true;
				} else if (c >= 97 && c <= 122) {
					all[c - 97] = true;
				}
			}

			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < 26; j++) {
				if (!all[j]) {
					sb.append((char) (j + 97));
				}
			}

			if (sb.length() == 0) {
				System.out.println("pangram");
			} else {
				System.out.println("missing " + sb.toString());
			}
		}

		reader.close();
	}
}
