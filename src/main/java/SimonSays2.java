import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solution for https://open.kattis.com/problems/simonsays
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SimonSays2 {

	private static final String SIMON_SAYS = "Simon says";
	private static final int LENGTH = SIMON_SAYS.length();

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			String line = reader.readLine();

			if (line.startsWith(SIMON_SAYS)) {
				String substring = line.substring(LENGTH);
				System.out.println(substring);
			}
		}

		reader.close();
	}

}
