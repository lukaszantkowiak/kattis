import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution for https://open.kattis.com/problems/simon
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SimonSays {
	private static final String SIMON_SAYS = "simon says ";

	public static void main(final String[] args) throws NumberFormatException, IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			final String command = reader.readLine();
			if (command.startsWith(SIMON_SAYS)) {
				System.out.println(command.substring(SIMON_SAYS.length()));
			} else {
				System.out.println();
			}
		}
	}

}
