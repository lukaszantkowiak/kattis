import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://open.kattis.com/problems/trainpassengers
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class TrainPassengers {
	private static final String IMPOSSIBLE = "impossible";
	private static final String POSSIBLE = "possible";

	private final int capacity;
	private final List<TrainStop> stops;

	public TrainPassengers(final int capacity, final List<TrainStop> stops) {
		this.capacity = capacity;
		this.stops = stops;
	}

	private String validate() {
		int passangers = 0;

		for (final TrainStop trainStop : this.stops) {
			if (trainStop.out > passangers) {
				return IMPOSSIBLE;
			}
			passangers -= trainStop.out;

			passangers += trainStop.in;
			if (passangers > this.capacity) {
				return IMPOSSIBLE;
			}

			if (trainStop.wait > 0 && passangers < this.capacity) {
				return IMPOSSIBLE;
			}
		}
		if (passangers != 0) {
			return IMPOSSIBLE;
		}

		return POSSIBLE;
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int c = io.getInt();

		final int n = io.getInt();

		final List<TrainStop> stops = new ArrayList<TrainStop>();

		for (int i = 0; i < n; i++) {
			stops.add(new TrainStop(io.getInt(), io.getInt(), io.getInt()));
		}

		io.println(new TrainPassengers(c, stops).validate());

		io.flush();
		io.close();
	}

	static class TrainStop {
		private final int out;
		private final int in;
		private final int wait;

		public TrainStop(final int out, final int in, final int wait) {
			this.out = out;
			this.in = in;
			this.wait = wait;
		}

	}
}
