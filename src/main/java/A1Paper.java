/**
 * Solution for https://open.kattis.com/problems/a1paper
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class A1Paper {

	public static void main(final String[] args) {

		final Kattio io = new Kattio(System.in, System.out);

		final int smallest = io.getInt();

		final double[] PAPER_SIZES = new double[smallest + 1];
		double width = Math.pow(2, -(5.0 / 4.0));
		double heigth = Math.pow(2, -(3.0 / 4.0));

		// calculate paper sizes
		for (int i = 2; i <= smallest; i++) {
			PAPER_SIZES[i] = heigth;
			final double tmp = heigth;
			heigth = width;
			width = tmp / 2.0;
		}

		int needed = 2;
		double usedTape = 0;

		for (int i = 2; i <= smallest; i++) {
			final int piece = io.getInt();
			if (piece >= needed) {
				usedTape += needed / 2 * PAPER_SIZES[i];
				needed = 0;
				break;
			} else {
				usedTape += (needed % 2 == 0 ? needed / 2 : needed / 2 + 1) * PAPER_SIZES[i];
				needed -= piece;
				needed *= 2;
			}
		}

		if (needed == 0) {
			io.println(usedTape);
		} else {
			io.println("impossible");
		}

		io.flush();
		io.close();
	}
}
