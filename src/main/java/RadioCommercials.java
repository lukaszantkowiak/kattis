/**
 * Solution for https://open.kattis.com/problems/commercials
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class RadioCommercials {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();
		final int p = io.getInt();

		final int[] profits = new int[n];

		for (int i = 0; i < n; i++) {
			profits[i] = io.getInt() - p;
		}

		io.println(maxSubSum(profits));

		io.flush();
		io.close();
	}

	private static int maxSubSum(final int[] a) {
		int maxSum = 0;
		int thisSum = 0;

		for (int j = 0; j < a.length; j++) {
			thisSum += a[j];

			if (thisSum > maxSum) {
				maxSum = thisSum;
			} else if (thisSum < 0) {
				thisSum = 0;
			}
		}

		return maxSum;
	}

}
