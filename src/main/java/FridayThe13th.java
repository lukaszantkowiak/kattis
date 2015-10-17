/**
 * Solution for https://open.kattis.com/problems/friday
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class FridayThe13th {

	private static final int WEEK = 7;
	private static final int SUNDAY = 6;
	private static final int FRIDAY = 4;

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int t = io.getInt();

		for (int i = 0; i < t; i++) {
			io.getInt();
			final int m = io.getInt();

			final int[] daysInMonths = new int[m];
			for (int j = 0; j < m; j++) {
				daysInMonths[j] = io.getInt();
			}

			io.println(calculateFridays(daysInMonths));
		}

		io.flush();
		io.close();
	}

	private static int calculateFridays(final int[] daysInMonths) {
		int fridays = 0;

		int day = SUNDAY;
		for (int m = 0; m < daysInMonths.length; m++) {
			for (int d = 0; d < daysInMonths[m]; d++) {
				if (day == FRIDAY && d == 12) {
					fridays++;
				}
				day = (day + 1) % WEEK;
			}
		}
		return fridays;
	}
}
