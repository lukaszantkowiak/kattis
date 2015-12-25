/**
 * Solution for https://open.kattis.com/problems/server
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class Server {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int n = io.getInt();
		int t = io.getInt();

		int time = 0;
		for (int i = 0; i < n; i++) {
			time += io.getInt();
			if (time > t) {
				io.println(i);
				io.flush();
				io.close();
				return;
			}
		}
		
		io.println(n);

		io.flush();
		io.close();
	}
}
