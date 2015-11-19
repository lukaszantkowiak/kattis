import java.util.HashSet;
import java.util.Set;

/**
 * Solution for https://open.kattis.com/problems/amanda
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class AmandaLounges {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();
		int m = io.getInt();

		int[][] connections = new int[m][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				connections[i][j] = -1;
			}
		}

		for (int i = 0; i < m; i++) {
			int a = io.getInt();
			int b = io.getInt();
			int s = io.getInt();

			if (a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}

			connections[a - 1][b - 1] = s;
		}

		// for (int i = 0; i < n; i++) {
		// System.out.println(Arrays.toString(connections[i]));
		// }

		Set<Integer> visited = new HashSet<Integer>();

		// we have connection with determined number of lounges
		int pos = -1;
		while ((pos = findFirst0Or2(connections, visited)) > -1) {

		}

		io.flush();
		io.close();
	}

	private static int findFirst0Or2(int[][] connections, Set<Integer> visited) {
		for (int i = 0; i < connections.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((!visited.contains(i)) && (connections[i][j] == 0 || connections[i][j] == 2)) {
					return i;
				}
			}
		}
		return -1;
	}
}
