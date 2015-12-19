import java.math.BigInteger;

/**
 * Solution for https://open.kattis.com/problems/setnja
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Setnja {
	private static final BigInteger TWO = BigInteger.valueOf(2L);
	private static final BigInteger THREE = BigInteger.valueOf(3L);

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		BigInteger result = BigInteger.ONE;
		BigInteger r = BigInteger.ONE;

		for (char w : io.getWord().toCharArray()) {
			switch (w) {
			case 'L':
				result = result.multiply(TWO);
				break;
			case 'R':
				result = result.multiply(TWO).add(r);
				break;
			case '*':
				result = result.add(result.multiply(TWO)).add(result.multiply(TWO).add(r));
				r = r.multiply(THREE);
				break;
			}
		}

		io.println(result);

		io.flush();
		io.close();

	}
}
