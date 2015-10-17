import java.util.Arrays;

/**
 * Solution for https://open.kattis.com/problems/clockpictures
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ClockPictures {

	private static final int MAX = 360000;

	static boolean check(final int[] clock1, final int[] clock2) {
		if (clock1.length == 0) {
			return false;
		}
		final StringBuilder difs1 = difs(clock1);
		final StringBuilder difs2 = difs(clock2);

		final String dd1 = difs1.toString() + "," + difs1.toString();

		return searchSubString(dd1, difs2.toString());
	}

	public static int[] preProcessPattern(final String pattern) {
		int j = -1;

		final int m = pattern.length();

		final int[] prefixFunction = new int[m + 1];

		prefixFunction[0] = j;
		for (int i = 0; i < m;) {
			while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) {
				j = prefixFunction[j];
			}
			prefixFunction[++i] = ++j;
		}
		return prefixFunction;
	}

	public static boolean searchSubString(final String text, final String pattern) {
		final int[] prefix = preProcessPattern(pattern);
		int q = 0;
		final int n = text.length();
		final int m = pattern.length();

		for (int i = 0; i < n; i++) {
			while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
				q = prefix[q];
			}
			if (pattern.charAt(q) == text.charAt(i)) {
				q++;
			}
			if (q == m) {
				return true;
			}
		}

		return false;
	}

	private static StringBuilder difs(final int[] clock) {

		final StringBuilder sb = new StringBuilder();

		int prev = clock[clock.length - 1];
		for (int i = 0; i < clock.length; i++) {
			final int t = clock[i] - prev;
			if (t > 0) {
				sb.append(',').append(t);
			} else {
				sb.append(t + MAX);
			}

			prev = clock[i];
		}

		return sb;
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final int[] clock1 = new int[n];
		final int[] clock2 = new int[n];

		for (int i = 0; i < n; i++) {
			clock1[i] = io.getInt();
		}
		for (int i = 0; i < n; i++) {
			clock2[i] = io.getInt();
		}

		Arrays.sort(clock1);
		Arrays.sort(clock2);

		if (check(clock1, clock2)) {
			io.println("possible");
		} else {
			io.println("impossible");
		}

		io.flush();
		io.close();
	}

}
