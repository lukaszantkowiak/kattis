import java.util.Arrays;

/**
 * Solution for https://open.kattis.com/problems/bread
 * 
 * Tricky part:
 * Notice that inverted pairs are changed each time for -2 or 0 or 2
 * 
 * 1. Count inverted pairs in current and expected situations
 * 2. Check if subtraction of them is even
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class BreadSorting {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		final int[] current = new int[n];
		final int[] expected = new int[n];

		for (int i = 0; i < n; i++) {
			current[i] = io.getInt();
		}
		for (int i = 0; i < n; i++) {
			expected[i] = io.getInt();
		}

		final int c = invCount(current);
		final int e = invCount(expected);

		final int a = Math.abs(c - e);

		if (a % 2 == 0) {
			io.println("Possible");
		} else {
			io.println("Impossible");
		}

		io.flush();
		io.close();
	}

	private static int merge(final int[] arr, final int[] left, final int[] right) {
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < left.length || j < right.length) {
			if (i == left.length) {
				arr[i + j] = right[j];
				j++;
			} else if (j == right.length) {
				arr[i + j] = left[i];
				i++;
			} else if (left[i] <= right[j]) {
				arr[i + j] = left[i];
				i++;
			} else {
				arr[i + j] = right[j];
				count += left.length - i;
				j++;
			}
		}
		return count;
	}

	private static int invCount(final int[] arr) {
		if (arr.length < 2)
			return 0;

		final int m = (arr.length + 1) / 2;
		final int left[] = Arrays.copyOfRange(arr, 0, m);
		final int right[] = Arrays.copyOfRange(arr, m, arr.length);

		return invCount(left) + invCount(right) + merge(arr, left, right);
	}
}
