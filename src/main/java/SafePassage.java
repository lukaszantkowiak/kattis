import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/safepassage
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SafePassage {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		final int n = io.getInt();

		NavigableSet<Person> people = new TreeSet<Person>(new PersonComparator());
		for (int i = 0; i < n; i++) {
			people.add(new Person(i, io.getInt()));
		}

		int time = 0;
		while (!people.isEmpty()) {
			if (people.size() >= 4) {
				Iterator<Person> ai = people.iterator();
				Iterator<Person> di = people.descendingIterator();

				Person a = ai.next();
				Person b = ai.next();

				Person d = di.next();
				Person c = di.next();

				int c1 = a.getTime() + 2 * b.getTime() + d.getTime();
				int c2 = 2 * a.getTime() + c.getTime() + d.getTime();

				time += Math.min(c1, c2);

				people.remove(c);
				people.remove(d);
			} else if (people.size() == 3) {
				final Person p1 = people.pollFirst();
				final Person p2 = people.pollFirst();
				final Person p3 = people.pollFirst();

				time += p3.getTime();
				time += p1.getTime();
				time += p2.getTime();
			} else {
				people.pollFirst();
				time += people.pollFirst().getTime();
			}
		}

		io.println(time);

		io.flush();
		io.close();
	}

	private static class PersonComparator implements Comparator<Person> {
		@Override
		public int compare(Person o1, Person o2) {
			int r = o1.time - o2.time;
			if (r != 0) {
				return r;
			}
			return o1.id - o2.id;
		}
	}

	private static class Person {
		private final int id;
		private final int time;

		public Person(int id, int time) {
			this.id = id;
			this.time = time;
		}

		public int getTime() {
			return time;
		}

		@Override
		public String toString() {
			return "id: " + id + "; time: " + time;
		}
	}
}
