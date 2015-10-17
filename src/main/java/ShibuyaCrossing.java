import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Kattis https://open.kattis.com/problems/shibuyacrossing
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ShibuyaCrossing {

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();
		int m = io.getInt();

		@SuppressWarnings("unchecked")
		Set<Integer>[] graph = new Set[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new TreeSet<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int a = io.getInt() - 1;
			int b = io.getInt() - 1;

			graph[a].add(b);
		}

		List<Integer> permutation = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			Set<Integer> before = new HashSet<Integer>();
			for (int j = 0; j < i; j++) {
				if (graph[j].contains(i)) {
					before.add(j);
				}
			}
			if (before.isEmpty()) {
				permutation.add(i);
			} else {
				int min = Integer.MAX_VALUE;
				for (Integer b : before) {
					int p = permutation.indexOf(b);
					if (p < min) {
						min = p;
					}
				}
				permutation.add(min, i);
			}
		}

		io.println(lds(permutation));
		io.flush();

		io.flush();
		io.close();
	}

	public static int lds(List<Integer> seq) {
		int[] lengths = new int[seq.size()];
		lengths[0] = 1;
		int max = 1;
		for (int i = 1; i < lengths.length; i++) {
			int maxt = 0;
			for (int j = 0; j < i; j++) {
				if (seq.get(j) > seq.get(i) && lengths[j] > maxt) {
					maxt = lengths[j];
				}
			}
			lengths[i] = maxt + 1;
			if (lengths[i] > max) {
				max = lengths[i];
			}
		}

		return max;
	}
}
