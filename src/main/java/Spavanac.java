/**
 * Solution for https://open.kattis.com/problems/spavanac
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Spavanac {

	private static final int HOURS = 24;
	private static final int MINUTES = 60;

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int hours = io.getInt();
		int minutes = io.getInt();

		minutes -= 45;

		if (minutes < 0) {
			hours = (hours + HOURS - 1) % HOURS;
			minutes += MINUTES;
		}

		io.println(hours + " " + minutes);

		io.flush();
		io.close();
	}

}
