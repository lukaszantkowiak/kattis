/**
 * Solution for https://open.kattis.com/problems/peg
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Peg {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final char[][] board = new char[7][7];

		for (int i = 0; i < 7; i++) {
			final String line = io.getWord();

			if (line.length() == 3) {
				for (int j = 2; j < 5; j++) {
					board[i][j] = line.charAt(j - 2);
				}
			} else {
				for (int j = 0; j < 7; j++) {
					board[i][j] = line.charAt(j);
				}
			}
		}

		int moves = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] == 'o') {
					try {
						if (board[i + 1][j] == 'o' && board[i + 2][j] == '.') {
							moves++;
						}
					} catch (final Exception e) {
					}
					try {
						if (board[i - 1][j] == 'o' && board[i - 2][j] == '.') {
							moves++;
						}
					} catch (final Exception e) {
					}
					try {
						if (board[i][j + 1] == 'o' && board[i][j + 2] == '.') {
							moves++;
						}
					} catch (final Exception e) {
					}
					try {
						if (board[i][j - 1] == 'o' && board[i][j - 2] == '.') {
							moves++;
						}
					} catch (final Exception e) {
					}
				}
			}
		}

		io.println(moves);

		io.flush();
		io.close();
	}

}
