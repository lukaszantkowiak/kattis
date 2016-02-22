/**
 * Solution for https://open.kattis.com/problems/maptiles2
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class IdentifyingMapTiles {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		String quadkey = io.getWord();

		int x = 0;
		int y = 0;
		int length = quadkey.length();
		int pow = (int) Math.pow(2, length - 1);
		for (int i = 0; i < length; i++) {
			if (quadkey.charAt(i) == '1' || quadkey.charAt(i) == '3') {
				x += pow;
			}
			if (quadkey.charAt(i) == '2' || quadkey.charAt(i) == '3') {
				y += pow;
			}
			pow /=2;
		}

		io.print(length);
		io.print(" ");
		io.print(x);
		io.print(" ");
		io.print(y);

		io.flush();
		io.close();
	}
}
