import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/lineup
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class LineThemUp {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();

		TreeSet<String> names = new TreeSet<String>();
		String name1 = io.getWord();
		names.add(name1);
		names.add(io.getWord());

		boolean inc = names.iterator().next().equals(name1);

		if (inc) {
			for (int i = 2; i < n; i++) {
				String name = io.getWord();
				names.add(name);
				if (!names.descendingIterator().next().equals(name)) {
					io.println("NEITHER");
					io.flush();
					io.close();
					return;
				}
			}
		} else {
			for (int i = 2; i < n; i++) {
				String name = io.getWord();
				names.add(name);
				if (!names.iterator().next().equals(name)) {
					io.println("NEITHER");
					io.flush();
					io.close();
					return;
				}
			}
		}
		
		if (inc) {
			io.println("INCREASING");
		} else {
			io.println("DECREASING");
		}

		io.flush();
		io.close();
	}
}
