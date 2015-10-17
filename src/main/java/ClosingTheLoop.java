import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/closingtheloop
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ClosingTheLoop {

	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final int t = Integer.parseInt(reader.readLine());

		for (int i = 1; i <= t; i++) {
			reader.readLine();

			final String[] pieces = reader.readLine().split(" ");

			final List<Integer> reds = new ArrayList<Integer>();
			final List<Integer> blues = new ArrayList<Integer>();

			for (final String piece : pieces) {
				if (piece.contains("B")) {
					blues.add(Integer.valueOf(piece.substring(0, piece.length() - 1)));
				} else {
					reds.add(Integer.valueOf(piece.substring(0, piece.length() - 1)));
				}
			}

			final int min = Math.min(blues.size(), reds.size());

			Collections.sort(reds, new IntegerComparator());
			Collections.sort(blues, new IntegerComparator());

			System.out
					.println("Case #" + i + ": " + (sum(blues.subList(0, min)) + sum(reds.subList(0, min)) - 2 * min));
		}
	}

	private static int sum(final Collection<Integer> collection) {
		int sum = 0;

		for (final Integer i : collection) {
			sum += i;
		}

		return sum;
	}

	private static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(final Integer o1, final Integer o2) {
			return o2 - o1;
		}
	}
}
