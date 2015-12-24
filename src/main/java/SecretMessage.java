/**
 * Solution for https://open.kattis.com/problems/secretmessage
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SecretMessage {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int[] pows = new int[101];

		for (int i = 1; i <= 100; i++) {
			pows[i] = i * i;
		}

		int n = io.getInt();

		for (int i = 0; i < n; i++) {
			String msg = io.getWord();

			int pow = 0;
			for (int j = 0; j < 100; j++) {
				if (pows[j + 1] >= msg.length()) {
					pow = j + 1;
					break;
				}
			}

			char[][] en = new char[pow][pow];
			int pos = 0;
			for (int j = 0; j < pow; j++) {
				for (int k = 0; k < pow; k++) {
					if (msg.length() > pos) {
						en[j][k] = msg.charAt(pos++);
					} else {
						en[j][k] = '*';
					}
				}
			}

			StringBuilder sb = new StringBuilder();

			for (int k = 0; k < pow; k++) {
				for (int j = pow - 1; j >= 0; j--) {
					if (en[j][k] != '*') {
						sb.append(en[j][k]);
					}
				}
			}

			io.println(sb);
		}

		io.flush();
		io.close();
	}

}
