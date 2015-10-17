import java.util.Set;
import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/phonelist
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class PhoneList {

	private static final int ASCII_SHIFT = 48;

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int t = io.getInt();

		for (int i = 0; i < t; i++) {
			final int n = io.getInt();

			final Set<String> words = new TreeSet<String>();

			boolean success = true;
			for (int j = 0; j < n; j++) {
				final String word = io.getWord();
				if (!words.add(word)) {
					success = false;
				}
			}

			if (success) {
				final NumberTree nt = new NumberTree();
				for (final String word : words) {
					if (word != null && !nt.add(word.toCharArray())) {
						success = false;
						break;
					}
				}
			}
			if (success) {
				io.println("YES");
			} else {
				io.println("NO");
			}
		}
		io.flush();
		io.close();

	}

	static class NumberTree {
		private final Node[] nodes = new Node[10];

		public boolean add(final char[] number) {

			Node current;
			Node[] currentNodes = this.nodes;

			for (int i = 0; i < number.length; i++) {
				final int digit = number[i] - ASCII_SHIFT;
				current = currentNodes[digit];
				if (current != null && (current.leaf || i == number.length - 1)) {
					return false;
				}
				if (current == null) {
					currentNodes[digit] = new Node();
					current = currentNodes[digit];
					if (i == number.length - 1) {
						current.leaf = true;
					}
				}
				currentNodes = current.childs;
			}

			return true;
		}
	}

	static class Node {
		private final Node[] childs = new Node[10];
		private boolean leaf;
	}
}
