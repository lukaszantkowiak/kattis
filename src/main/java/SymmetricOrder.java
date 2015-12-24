import java.util.LinkedList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/symmetricorder
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SymmetricOrder {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int set = 1;
		int n;

		while ((n = io.getInt()) != 0) {
			io.print("SET ");
			io.println(set++);

			List<String> names = new LinkedList<String>();
			for (int i = 0; i < n; i++) {
				String name = io.getWord();

				if (i % 2 == 0) {
					names.add(i / 2, name);
				} else {
					names.add(names.size() - i / 2, name);
				}
			}

			for (String name : names) {
				io.println(name);
			}
		}

		io.flush();
		io.close();
	}
}
