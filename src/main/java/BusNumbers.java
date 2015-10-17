import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/busnumbers
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class BusNumbers {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			numbers.add(io.getInt());
		}

		Collections.sort(numbers);

		final StringBuilder sb = new StringBuilder();
		int last;
		for (int i = 0; i < numbers.size();) {
			final int cur = numbers.get(i);
			last = cur;
			while (++i < numbers.size() && numbers.get(i) == last + 1) {
				last = numbers.get(i);
			}
			if (cur == last) {
				sb.append(cur).append(" ");
			} else if (cur == last - 1) {
				sb.append(cur).append(" ");
				sb.append(last).append(" ");
			} else {
				sb.append(cur).append("-").append(last).append(" ");
			}
		}

		io.println(sb);

		io.flush();
		io.close();
	}
}
