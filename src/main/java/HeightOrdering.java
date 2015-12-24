import java.util.LinkedList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/height
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class HeightOrdering {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();

		for (int i = 0; i < n; i++) {
			int s = io.getInt();
			int steps = 0;

			List<Integer> students = new LinkedList<Integer>();
			students.add(io.getInt());
			for (int j = 1; j < 20; j++) {
				int newStudent = io.getInt();
				int k;
				for (k = 0; k < students.size(); k++) {
					if (students.get(k) > newStudent) {
						break;
					}
				}
				students.add(k, newStudent);
				steps += students.size() - k - 1;
			}

			io.print(s);
			io.print(" ");
			io.println(steps);
		}

		io.flush();
		io.close();
	}
}
