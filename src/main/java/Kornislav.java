import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/kornislav
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Kornislav {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final List<Integer> steps = new ArrayList<Integer>();
		steps.add(io.getInt());
		steps.add(io.getInt());
		steps.add(io.getInt());
		steps.add(io.getInt());

		Collections.sort(steps);

		io.println(steps.get(0) * steps.get(2));

		io.flush();
		io.close();
	}

}
