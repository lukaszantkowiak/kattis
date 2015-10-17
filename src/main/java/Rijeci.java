/**
 * Solution for https://open.kattis.com/problems/rijeci
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Rijeci {

	private static final int[] FIB = new int[46];

	static {
		FIB[0] = 0;
		FIB[1] = 1;
		FIB[2] = 1;
		for (int i = 3; i < 46; i++) {
			FIB[i] = FIB[i - 1] + FIB[i - 2];
		}
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int clicks = io.getInt();

		switch (clicks) {
		case 0:
			io.println("1 0");
			break;
		default:
			io.println(FIB[clicks - 1] + " " + FIB[clicks]);
			break;
		}

		io.flush();
		io.close();
	}

}
