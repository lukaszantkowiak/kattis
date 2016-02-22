/**
 * Solution for https://open.kattis.com/problems/areal
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ARealChallenge {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		long n = io.getLong();

		io.println(4 * Math.sqrt(n));

		io.flush();
		io.close();
	}
}
