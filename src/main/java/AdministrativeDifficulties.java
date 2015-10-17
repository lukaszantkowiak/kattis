import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Solution for https://open.kattis.com/problems/administrativeproblems
 * 
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class AdministrativeDifficulties {
	private static final String INCONSISTENT = "INCONSISTENT";

	private final Map<String, Car> cars;
	private final Map<String, List<Event>> events;

	public AdministrativeDifficulties(final Map<String, Car> cars, final Map<String, List<Event>> events) {
		this.cars = cars;
		this.events = events;
	}

	private Set<String> calculate() {
		final Set<String> result = new TreeSet<String>();
		for (final String agent : this.events.keySet()) {
			result.add(calculateForAgent(agent, this.events.get(agent)));
		}

		return result;
	}

	private String calculateForAgent(final String agent, final List<Event> events) {
		String rentedCar = null;
		int totalCost = 0;

		for (final Event event : events) {
			switch (event.type) {
			case 'p':
				if (rentedCar != null) {
					return agent + " " + INCONSISTENT;
				}
				rentedCar = event.carType;
				totalCost += this.cars.get(event.carType).pickUpCost;
				break;
			case 'r':
				if (rentedCar == null) {
					return agent + " " + INCONSISTENT;
				}
				totalCost += this.cars.get(rentedCar).kilometerCost * event.distance;
				rentedCar = null;
				break;
			case 'a':
				if (rentedCar == null) {
					return agent + " " + INCONSISTENT;
				}
				int price = event.damage * this.cars.get(rentedCar).catalogPrice;
				final int mod = price % 100;
				if (mod > 0) {
					price += 100 - mod;
				}
				price /= 100;
				totalCost += price;
				break;
			}
		}
		if (rentedCar != null) {
			return agent + " " + INCONSISTENT;
		}

		return agent + " " + totalCost;
	}

	public static void main(final String[] args) {
		final Kattio io = new Kattio(System.in, System.out);

		final int t = io.getInt();

		for (int i = 0; i < t; i++) {
			final int n = io.getInt();
			final int m = io.getInt();

			final Map<String, Car> cars = new HashMap<String, Car>();

			for (int j = 0; j < n; j++) {
				final String name = io.getWord();
				final int catalogPrice = io.getInt();
				final int pickUpCost = io.getInt();
				final int kilometerCost = io.getInt();

				cars.put(name, new Car(catalogPrice, pickUpCost, kilometerCost));
			}

			final Map<String, List<Event>> events = new HashMap<String, List<Event>>();

			for (int j = 0; j < m; j++) {
				io.getInt(); // time is ignored
				final String agent = io.getWord();
				final char type = io.getWord().charAt(0);
				final Event event = new Event(agent, type);

				switch (type) {
				case 'p':
					event.setCarType(io.getWord());
					break;
				case 'r':
					event.setDistance(io.getInt());
					break;
				case 'a':
					event.setDamage(io.getInt());
					break;
				}

				if (events.containsKey(event.agent)) {
					events.get(event.agent).add(event);
				} else {
					final List<Event> eventsList = new ArrayList<Event>();
					eventsList.add(event);
					events.put(event.agent, eventsList);
				}
			}

			for (final String r : new AdministrativeDifficulties(cars, events).calculate()) {
				io.println(r);
			}
		}

		io.flush();
		io.close();

	}

	static class Car {
		private final int catalogPrice;
		private final int pickUpCost;
		private final int kilometerCost;

		public Car(final int catalogPrice, final int pickUpCost, final int kilometerCost) {
			this.catalogPrice = catalogPrice;
			this.pickUpCost = pickUpCost;
			this.kilometerCost = kilometerCost;
		}

	}

	static class Event {
		private final String agent;
		private final char type;
		private String carType;
		private int distance;
		private int damage;

		public Event(final String agent, final char type) {
			this.agent = agent;
			this.type = type;
		}

		public void setCarType(final String carType) {
			this.carType = carType;
		}

		public void setDistance(final int distance) {
			this.distance = distance;
		}

		public void setDamage(final int damage) {
			this.damage = damage;
		}

	}

}
