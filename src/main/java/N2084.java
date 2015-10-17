import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/2048
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class N2084 {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int[][] board = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				board[i][j] = io.getInt();
			}
		}

		final int direction = io.getInt();

		if (direction == 0) {
			for (int i = 0; i < 4; i++) {
				List<Integer> line = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					line.add(board[i][j]);
				}
				line = calculateMove(line);
				for (int j = 0; j < 4; j++) {
					board[i][j] = line.get(j);
				}
			}
		} else if (direction == 1) {
			for (int i = 0; i < 4; i++) {
				List<Integer> line = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					line.add(board[j][i]);
				}
				line = calculateMove(line);
				for (int j = 0; j < 4; j++) {
					board[j][i] = line.get(j);
				}
			}
		} else if (direction == 2) {
			for (int i = 0; i < 4; i++) {
				List<Integer> line = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					line.add(board[i][j]);
				}
				Collections.reverse(line);
				line = calculateMove(line);
				Collections.reverse(line);
				for (int j = 0; j < 4; j++) {
					board[i][j] = line.get(j);
				}
			}
		} else if (direction == 3) {
			for (int i = 0; i < 4; i++) {
				List<Integer> line = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					line.add(board[j][i]);
				}
				Collections.reverse(line);
				line = calculateMove(line);
				Collections.reverse(line);
				for (int j = 0; j < 4; j++) {
					board[j][i] = line.get(j);
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j > 0) {
					io.print(" ");
				}
				io.print(board[i][j]);
			}
			io.println();
		}

		io.flush();
		io.close();
	}

	private static List<Integer> calculateMove(final List<Integer> line) {
		final Integer zero = Integer.valueOf(0);
		for (int i = 0; i < 4; i++) {
			line.remove(zero);
		}

		final List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < line.size(); i++) {
			if (line.size() > i + 1 && line.get(i).equals(line.get(i + 1))) {
				result.add(line.get(i) + line.get(i + 1));
				i++;
			} else {
				result.add(line.get(i));
			}
		}

		while (result.size() < 4) {
			result.add(zero);
		}

		return result;
	}
}
