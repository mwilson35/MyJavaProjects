/**
 * 
 */
package revise;

/**
 * 
 */
public class WeatherChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double average, day1, day2, day3, day4, day5;
		boolean sunday1, sunday2, sunday3, sunday4, sunday5;
		int numberofsundays;
		numberofsundays=0;
		sunday1 = true;
		sunday2 = false;
		sunday3 = true;
		sunday4 = true;
		sunday5 = false;

		day1 = 15.5;
		day2 = 10.5;
		day3 = 16.0;
		day4 = 12.5;
		day5 = 17.0;

		average = (day1 + day2 + day3 + day4 + day5) / 5;
		
		if(sunday1) {
			numberofsundays++;
		}
		if(sunday2) {
			numberofsundays++;
		}
		if(sunday3) {
			numberofsundays++;
		}
		if(sunday4) {
			numberofsundays++;
		}
		if(sunday5) {
			numberofsundays++;
		}

		System.out.println("Weather analysis");
		System.out.println("_______________________________");
		System.out.println("Day 1");
		System.out.println("Temp\t: " + day1);
		System.out.println("sun\t: true");
		if (day1 > average) {
			System.out.println("Above average temp");
		}
		System.out.println("_______________________________");
		System.out.println("Day 2");
		System.out.println("Temp\t: " + day2);
		System.out.println("sun\t: true");
		if (day2 > average) {
			System.out.println("Above average temp");
		}
		System.out.println("_______________________________");
		System.out.println("Day 3");
		System.out.println("Temp\t: " + day3);
		System.out.println("sun\t: true");
		if (day3 > average) {
			System.out.println("Above average temp");
		}
		System.out.println("_______________________________");
		System.out.println("Day 4");
		System.out.println("Temp\t: " + day4);
		System.out.println("sun\t: true");
		if (day4 > average) {
			System.out.println("Above average temp");
		}
		System.out.println("_______________________________");
		System.out.println("Day 5");
		System.out.println("Temp\t: " + day5);
		System.out.println("sun\t: true");
		if (day5 > average) {
			System.out.println("Above average temp");
		}
		System.out.println("\nOverall stats\nAverage temp\t\t : "+average);
		System.out.println("number of days of sun\t : "+numberofsundays);
		
	}
}