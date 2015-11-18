
/**
 * Solution for https://open.kattis.com/problems/toilet
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class ToiletSeat {
	private static final char UP = 'U';
	private static final char DOWN = 'D';

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		String sequence = io.getWord();

		String people = sequence.substring(1);

		char position = sequence.charAt(0);
		io.println(countUp(position, people.toCharArray()));
		io.println(countDown(position, people.toCharArray()));
		io.println(countLike(position, people.toCharArray()));

		io.flush();
		io.close();
	}

	private static int countLike(char position, char[] people) {
		int counter = 0;
		for (char c : people) {
			if (c == UP && position == DOWN) {
				counter++;
				position = UP;
			} else if (c == DOWN && position == UP) {
				counter++;
				position = DOWN;
			}
		}

		return counter;
	}

	private static int countUp(char position, char[] people) {
		return countUpDown(position, people, UP);
	}

	private static int countDown(char position, char[] people) {
		return countUpDown(position, people, DOWN);
	}

	private static int countUpDown(char position, char[] people, char leftPosition) {
		int counter = 0;
		for (char c : people) {
			if (position != c) {
				counter++;
				if (position == leftPosition) {
					counter++;
				}
			} else if (position != leftPosition) {
				counter++;
			}
			position = leftPosition;
		}

		return counter;
	}

}
