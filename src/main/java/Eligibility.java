/**
 * Solution for https://open.kattis.com/problems/eligibility
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Eligibility {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int tc = io.getInt();
		for (int i = 0; i < tc; i++) {
			String name = io.getWord();
			String postDate = io.getWord();
			String birthDate = io.getWord();
			int courses = io.getInt();

			if (postDate.charAt(2) >= '1' || Integer.parseInt(birthDate.substring(0, 4)) >= 1991) {
				io.println(name + " eligible");
			} else if (courses > 40) {
				io.println(name + " ineligible");
			} else {
				io.println(name + " coach petitions");
			}
		}

		io.flush();
		io.close();
	}

}
