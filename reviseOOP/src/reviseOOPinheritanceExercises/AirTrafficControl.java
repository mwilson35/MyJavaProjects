/**
 * 
 */
package reviseOOPinheritanceExercises;

/**
 * 
 */
public class AirTrafficControl {

	/**
	 * 
	 */
	public AirTrafficControl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flight f1 = new Flight();
		f1.setFlightNumber("ESY3214");
		f1.setOrigin("Amsterdam");
		f1.setDestination("Belfast");
		f1.setDuration(2.2);

		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("ESY3214", "Newark", "Dublin", 8.5);

		System.out.println("All flight info: ");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());

		// alternative
		Flight[] flights = { f1, f2, f3, f4 };
		System.out.println("All flights from array: ");
		for (int loop = 0; loop < flights.length; loop++) {
			System.out.println(flights[loop].toString());

		}//longest flight array search
		double longestFlight = flights[0].getDuration();
		for (int loop = 0; loop < flights.length; loop++) {
			if(flights[loop].getDuration()>longestFlight) {
				longestFlight=flights[loop].getDuration();			}
		}
		System.out.println("The longest flight duration : "+longestFlight);
		
		System.out.println("All flights from Dublin : ");
		for(int loop=0;loop<flights.length;loop++) {
			if(flights[loop].getOrigin().equalsIgnoreCase("Dublin")) {
				System.out.println(flights[loop].getFlightNumber());
			}
		}
		Flight f5=new Flight("AUS12", "Beijing", "Paris", 18.1);
		System.out.println(f5.toString());
	}
	
}
