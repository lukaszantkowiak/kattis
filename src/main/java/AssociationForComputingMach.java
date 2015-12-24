import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/acm2
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class AssociationForComputingMach {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int result = 0;
		int solved = 0;

		int n = io.getInt();
		int p = io.getInt();

		List<Integer> problems = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			problems.add(io.getInt());
		}

		int firstProblem = problems.get(p);

		if (firstProblem <= 300) {
			problems.remove(p);
			Collections.sort(problems);

			int elapsed = firstProblem;
			solved++;
			result += elapsed;

			for (int i = 0; i < problems.size(); i++) {
				elapsed += problems.get(i);

				if (elapsed > 300) {
					break;
				}

				solved++;
				result += elapsed;
			}
		}

		io.print(solved);
		io.print(" ");
		io.println(result);

		io.flush();
		io.close();
	}
}
