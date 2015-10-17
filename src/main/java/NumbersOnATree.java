import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution for https://open.kattis.com/problems/numbertree
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class NumbersOnATree {
	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final String[] input = reader.readLine().split(" ");

		final int h = Integer.parseInt(input[0]);
		final String path = input.length == 2 ? input[1] : "";

		long value = (long) Math.pow(2, h + 1) - 1;
		long base = 1;

		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'L') {
				value -= base;
			} else {
				value -= base + 1;
			}
			if (path.charAt(i) == 'L') {
				base = 2 * base;
			} else {
				base = 2 * base + 1;
			}
		}

		System.out.println(value);
	}
}
