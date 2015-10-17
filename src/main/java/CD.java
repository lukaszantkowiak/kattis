
/**
 * Solution for https://open.kattis.com/problems/cd
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class CD {
	public static void main(String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int n;
		int m;

		n = io.getInt();
		m = io.getInt();
		while (n != 0 || m != 0) {
			boolean[] cds = new boolean[10000001];
			int common = 0;

			for (int i = 0; i < n + m; i++) {
				int cd = io.getInt();
				if (cds[cd]) {
					common++;
				} else {
					cds[cd] = true;
				}
			}

			io.println(common);

			n = io.getInt();
			m = io.getInt();
		}

		io.flush();
		io.close();
	}
}
