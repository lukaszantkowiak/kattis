/**
 * Solution for https://open.kattis.com/problems/estimatingtheareaofacircle
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class EstimatingTheAreaOfACircle {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		double r;

		while ((r = io.getDouble()) > 0) {
			int m = io.getInt();
			int c = io.getInt();

			double r2 = r * r;
			double realSurface = Math.PI * r2;
			double estimatedSurface = 4.0 * c / m * r2;
			
			io.print(realSurface);
			io.print(" ");
			io.println(estimatedSurface);
		}

		io.flush();
		io.close();
	}
}
