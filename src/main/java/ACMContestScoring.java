import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/acm
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ACMContestScoring {
	private static final String RIGHT = "right";

	public static void main(String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		Map<String, Integer> problems = new HashMap<String, Integer>();

		int solved = 0;
		int summary = 0;

		int time;
		while ((time = io.getInt()) != -1) {
			String problem = io.getWord();
			int current = problems.containsKey(problem) ? problems.get(problem) : 0;
			if (RIGHT.equals(io.getWord())) {
				summary += time + current;
				solved++;
			} else {
				problems.put(problem, current + 20);
			}
		}

		io.print(solved);
		io.print(" ");
		io.println(summary);

		io.flush();
		io.close();
	}
}
