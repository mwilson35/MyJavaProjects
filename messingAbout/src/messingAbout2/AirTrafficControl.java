/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Newark", "Dublin", 8.5);

		Flight[] flights = { f1, f2, f3, f4 };
		for (int loop = 0; loop < flights.length; loop++) {
			System.out.println(flights[loop]);

		}

		double longestFlight = flights[0].getDuration();
		for (int loop = 0; loop < flights.length; loop++) {
			if(flights[loop].getDuration()>longestFlight) {
				longestFlight=flights[loop].getDuration();			}
		}System.out.println("Longest flight: "+longestFlight);
		System.out.println();
		System.out.println("All flights from Dublin: ");
		for(int loop=0;loop<flights.length;loop++) {
			if(flights[loop].getOrigin().equalsIgnoreCase("Dublin")) {
				System.out.println(flights[loop].getFlightNumber());
			}
		}Flight f5=new Flight("AUS12", "Beijing", "Paris", 18.1);
		System.out.println(f5.toString());
	}
}
