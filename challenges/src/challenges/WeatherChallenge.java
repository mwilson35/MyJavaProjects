/**
 * 
 */
package challenges;

/**
 * Solution for weather challenge
 * 
 * @author Micko
 */
public class WeatherChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5, averageTemp;
		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5;
		int sunTrue;
		tempDay1 = 15.5;
		tempDay2 = 10.5;
		tempDay3 = 16.0;
		tempDay4 = 12.5;
		tempDay5 = 17.0;
		sunDay1 = true;
		sunDay2 = false;
		sunDay3 = true;
		sunDay4 = true;
		sunDay5 = false;
		sunTrue=0;
		
		if(sunDay1) {
			sunTrue++;
		
		}if(sunDay2) {
			sunTrue++;
		}if(sunDay3) {
			sunTrue++;
		}if(sunDay4) {
			sunTrue++;
		}if(sunDay5) {
			sunTrue++;
		}

		averageTemp = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5;

		System.out.println("Weather analysis");
		System.out.println("____________________________");
		System.out.println("Day 1");
		System.out.println("Temp\t : " + tempDay1);
		System.out.println("Sun\t : " + sunDay1);
		if (tempDay1 > averageTemp) {
			System.out.println("Above average temp");
		}
		System.out.println("____________________________");
		System.out.println("Day 2");
		System.out.println("Temp\t : " + tempDay2);
		System.out.println("Sun\t : " + sunDay2);
		if (tempDay2 > averageTemp) {
			System.out.println("Above average temp");
		}
		System.out.println("____________________________");
		System.out.println("Day 3");
		System.out.println("Temp\t : " + tempDay3);
		System.out.println("Sun\t : " + sunDay3);
		if (tempDay3 > averageTemp) {
			System.out.println("Above average temp");

		}
		System.out.println("____________________________");
		System.out.println("Day 4");
		System.out.println("Temp\t : " + tempDay4);
		System.out.println("Sun\t : " + sunDay4);
		if (tempDay4 > averageTemp) {
			System.out.println("Above average temp");
		}
		System.out.println("____________________________");
		System.out.println("Day 5");
		System.out.println("Temp\t : " + tempDay5);
		System.out.println("Sun\t : " + sunDay5);
		if (tempDay5 > averageTemp) {
			System.out.println("Above average temp");
			System.out.println("____________________________");

		}System.out.println("Overall stats");
		System.out.println("Average temp\t\t : "+averageTemp);
		System.out.println("Number of days of sun\t : "+sunTrue);
	}
}
