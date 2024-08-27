/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");

		City[] cities = { c1, c2, c3, c4, c5, c6 };
		displayAll(cities);
		smallestCity(cities);
		averagePopulation(cities);
	}

	public static void displayAll(City[] cities) {
		System.out.println("Displaying city info");
		for (City city : cities) {
			System.out.println(city.toString());
		}
		System.out.println();
	}

	public static void smallestCity(City[] cities) {
		System.out.println("Displaying smallest city");
		int smallestpop = cities[0].getPopulation();
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].getPopulation() < smallestpop) {
				smallestpop = cities[loop].getPopulation();
			}
		}
		System.out.println("Smallest population : " + smallestpop);

		
		
	}

	public static void averagePopulation(City[] cities) {
		System.out.println("Average population");
		int total = 0;

		for (int loop = 0; loop < cities.length; loop++) {
			total += cities[loop].getPopulation();
		}
		System.out.printf("Average population : %.2f", (double) total / cities.length);
	}
}
