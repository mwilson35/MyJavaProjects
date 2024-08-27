/**
 * 
 */
package revise2;

/**
 * 
 */
public class GenderAgeTracker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age;
		String gender;

		age = 35;
		gender = "male";
			//logical AND &&
		if (gender.equalsIgnoreCase("male") && age < 40) {
			System.out.println("Male and under 40");
		}
		     //logical OR ||
		if (gender.equalsIgnoreCase("male") || age > 40) {
			System.out.println("Something was true");
		}
		if (gender.equalsIgnoreCase("female") && age > 40) {
			System.out.println("Female and over 40");
		}

	}

}
