import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for https://open.kattis.com/problems/falsesecurity
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class FalseSenseOfSecurity {

	private static final Map<Character, String> CHAR_TO_CODE = new HashMap<Character, String>();
	private static final Map<String, Character> CODE_TO_CHAR = new HashMap<String, Character>();

	static {
		CHAR_TO_CODE.put('A', ".-");
		CHAR_TO_CODE.put('B', "-...");
		CHAR_TO_CODE.put('C', "-.-.");
		CHAR_TO_CODE.put('D', "-..");
		CHAR_TO_CODE.put('E', ".");
		CHAR_TO_CODE.put('F', "..-.");
		CHAR_TO_CODE.put('G', "--.");
		CHAR_TO_CODE.put('H', "....");
		CHAR_TO_CODE.put('I', "..");
		CHAR_TO_CODE.put('J', ".---");
		CHAR_TO_CODE.put('K', "-.-");
		CHAR_TO_CODE.put('L', ".-..");
		CHAR_TO_CODE.put('M', "--");
		CHAR_TO_CODE.put('N', "-.");
		CHAR_TO_CODE.put('O', "---");
		CHAR_TO_CODE.put('P', ".--.");
		CHAR_TO_CODE.put('Q', "--.-");
		CHAR_TO_CODE.put('R', ".-.");
		CHAR_TO_CODE.put('S', "...");
		CHAR_TO_CODE.put('T', "-");
		CHAR_TO_CODE.put('U', "..-");
		CHAR_TO_CODE.put('V', "...-");
		CHAR_TO_CODE.put('W', ".--");
		CHAR_TO_CODE.put('X', "-..-");
		CHAR_TO_CODE.put('Y', "-.--");
		CHAR_TO_CODE.put('Z', "--..");
		CHAR_TO_CODE.put('_', "..--");
		CHAR_TO_CODE.put(',', ".-.-");
		CHAR_TO_CODE.put('.', "---.");
		CHAR_TO_CODE.put('?', "----");

		for (Map.Entry<Character, String> entry : CHAR_TO_CODE.entrySet()) {
			CODE_TO_CHAR.put(entry.getValue(), entry.getKey());
		}
	}

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		String msg;

		while ((msg = io.getWord()) != null) {
			StringBuilder coded = new StringBuilder();
			List<Integer> lengths = new ArrayList<Integer>();
			char[] msgArr = msg.toCharArray();
			for (char c : msgArr) {
				String morseCode = CHAR_TO_CODE.get(c);
				coded.append(morseCode);
				lengths.add(morseCode.length());
			}

			StringBuilder result = new StringBuilder();
			int ind = 0;
			
			Collections.reverse(lengths);

			for (int i = 0; i < lengths.size(); i++) {
				int len = lengths.get(i);
				result.append(CODE_TO_CHAR.get(coded.substring(ind, ind + len)));
				
				ind += len;
			}
			
			io.println(result);
		}

		io.flush();
		io.close();
	}

}
