/**
 * Solution for https://open.kattis.com/problems/speedlimit
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class SpeedLimit {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int rows;
		while ((rows = io.getInt()) != -1) {
			int miles = 0;
			int hours = 0;

			for (int i = 0; i < rows; i++) {
				int speed = io.getInt();
				int time = io.getInt();
				
				miles += ((time - hours) * speed);
				hours += time - hours;
			}
			
			io.println(miles + " miles");
		}

		io.flush();
		io.close();
	}
}
