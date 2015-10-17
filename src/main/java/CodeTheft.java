import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/codetheft
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class CodeTheft {
	private static final String END_OF_CODE = "***END***";

	public static void main(final String[] args) throws NumberFormatException, IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final int n = Integer.valueOf(reader.readLine());

		final List<CodeSnippet> repo = new ArrayList<CodeSnippet>();

		for (int i = 0; i < n; i++) {
			final String fileName = reader.readLine();

			repo.add(new CodeSnippet(fileName, readCode(reader)));
		}

		final List<String> codeToCheck = readCode(reader);

		check(codeToCheck, repo);

	}

	private static void check(final List<String> code, final List<CodeSnippet> repo) {

		int max = 0;
		List<String> files = new ArrayList<String>();

		for (final CodeSnippet codeSnippet : repo) {
			final int l = longestSubstr(code, codeSnippet.lines);

			if (l > max) {
				max = l;
				files = new ArrayList<String>();
			}
			if (l == max) {
				files.add(codeSnippet.fileName);
			}
		}

		if (max == 0) {
			System.out.println("0");
		} else {
			System.out.print(max);
			for (final String file : files) {
				System.out.print(" " + file);
			}
			System.out.println();
		}
	}

	private static List<String> readCode(final BufferedReader reader) throws IOException {
		final List<String> code = new ArrayList<String>();
		String line;

		while (!(line = reader.readLine().trim()).equals(END_OF_CODE)) {
			if (!line.isEmpty()) {
				code.add(line.replaceAll("\\s+", " "));
			}
		}

		return code;
	}

	public static int longestSubstr(final List<String> s, final List<String> t) {
		if (s.isEmpty() || t.isEmpty()) {
			return 0;
		}

		final int m = s.size();
		final int n = t.size();
		int cost = 0;
		int maxLen = 0;
		int[] p = new int[n];
		int[] d = new int[n];

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (!s.get(i).equals(t.get(j))) {
					cost = 0;
				} else {
					if ((i == 0) || (j == 0)) {
						cost = 1;
					} else {
						cost = p[j - 1] + 1;
					}
				}
				d[j] = cost;

				if (cost > maxLen) {
					maxLen = cost;
				}
			}

			final int[] swap = p;
			p = d;
			d = swap;
		}

		return maxLen;
	}

	static class CodeSnippet {
		private final String fileName;
		private final List<String> lines;

		public CodeSnippet(final String fileName, final List<String> lines) {
			this.fileName = fileName;
			this.lines = lines;
		}
	}
}
