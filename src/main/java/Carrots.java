import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution for https://open.kattis.com/problems/carrots
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Carrots {
	public static void main(final String[] args) throws IOException {
		final String res = new BufferedReader(new InputStreamReader(System.in)).readLine();

		System.out.println(res.substring(res.indexOf(' ') + 1));
	}
}
