import java.util.HashSet;
import java.util.Set;

/**
 * Solution for https://open.kattis.com/problems/everywhere
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class IHaveBeenEverywhereMan {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int tc = io.getInt();
		for (int i = 0; i < tc; i++) {
			int n = io.getInt();
			Set<String> places = new HashSet<String>();
			for (int j = 0; j < n; j++) {
				places.add(io.getWord());
			}
			io.println(places.size());
		}

		io.flush();
		io.close();
	}

}
