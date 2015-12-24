import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/hittingtargets
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class HittingTheTargets {
	private static final String RECTANGLE = "rectangle";

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		List<Figure> figures = new ArrayList<HittingTheTargets.Figure>();

		int n = io.getInt();
		for (int i = 0; i < n; i++) {
			if (RECTANGLE.equals(io.getWord())) {
				figures.add(new Rectangle(io.getInt(), io.getInt(), io.getInt(), io.getInt()));
			} else {
				figures.add(new Circle(io.getInt(), io.getInt(), io.getInt()));
			}
		}

		n = io.getInt();
		for (int i = 0; i < n; i++) {
			int x = io.getInt();
			int y = io.getInt();

			int hits = 0;
			for (Figure fig : figures) {
				if (fig.isInside(x, y)) {
					hits++;
				}
			}
			io.println(hits);
		}

		io.flush();
		io.close();
	}

	private static abstract class Figure {
		public abstract boolean isInside(int x, int y);
	}

	private static class Rectangle extends Figure {
		private int x1;
		private int y1;
		private int x2;
		private int y2;

		@Override
		public boolean isInside(int x, int y) {
			return x >= x1 && x <= x2 && y >= y1 && y <= y2;
		}

		public Rectangle(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	private static class Circle extends Figure {
		private int x;
		private int y;
		private int r2;

		public Circle(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r2 = r * r;
		}

		@Override
		public boolean isInside(int x, int y) {
			return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) <= r2;
		}
	}
}
