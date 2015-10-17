/**
 * Solution for https://open.kattis.com/problems/savingdaylight
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SavingDaylight {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		while (io.hasMoreTokens()) {
			final StringBuilder date = new StringBuilder();

			date.append(io.getWord());
			date.append(" ");
			date.append(io.getWord());
			date.append(" ");
			date.append(io.getWord());
			date.append(" ");

			final String[] s = io.getWord().split(":");
			final String[] e = io.getWord().split(":");

			int mins = Integer.parseInt(e[1]) - Integer.parseInt(s[1]);
			int hours = Integer.parseInt(e[0]) - Integer.parseInt(s[0]);
			if (mins < 0) {
				hours--;
				mins += 60;
			}

			date.append(hours);
			date.append(" hours ");
			date.append(mins);
			date.append(" minutes");

			io.println(date.toString());
		}

		io.flush();
		io.close();
	}

}
