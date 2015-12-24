/**
 * Solution for https://open.kattis.com/problems/cold
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ColdPuterScience {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();

		int result = 0;
		for (int i = 0; i < n; i++) {
			if (io.getInt() < 0) {
				result++;
			}
		}

		io.println(result);

		io.flush();
		io.close();
	}
}
