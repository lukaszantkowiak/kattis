import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/synchronizinglists
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SynchronizingLists {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n;
		while ((n = io.getInt()) != 0) {
			List<Integer> list1 = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list1.add(io.getInt());
			}

			List<Integer> list1Sorted = new ArrayList<Integer>(list1);
			Collections.sort(list1Sorted);

			List<Integer> list2Sorted = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list2Sorted.add(io.getInt());
			}
			Collections.sort(list2Sorted);

			for (int i = 0; i < list1.size(); i++) {
				int ind = list1Sorted.indexOf(list1.get(i));
				io.println(list2Sorted.get(ind));
			}

			io.println();
		}

		io.flush();
		io.close();
	}
}
