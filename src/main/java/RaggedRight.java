import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/raggedright
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class RaggedRight {

	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final List<Integer> lengths = new ArrayList<Integer>();
		int max = -1;

		String line;

		while ((line = reader.readLine()) != null) {
			final int len = line.length();
			lengths.add(len);
			if (len > max) {
				max = len;
			}
		}

		lengths.remove(lengths.size() - 1);

		int r = 0;

		for (final Integer l : lengths) {
			final int t = max - l;
			r += t * t;
		}

		System.out.println(r + "");
	}

}
