/**
 * 
 */
package reviseExercises;

/**
 * 
 */
public class DaySwitcherIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dayNo;
		String dayName;

		dayNo = 3;

		if (dayNo == 1) {
			dayName = "Monday";
		} else if (dayNo == 2) {
			dayName = "Tuesday";
		} else if (dayNo == 3) {
			dayName = "Wednesday";
		} else if (dayNo == 4) {
			dayName = "Thursday";
		} else if (dayNo == 5) {
			dayName = "Friday";
		} else if (dayNo == 6) {
			dayName = "Saturday";
		} else if (dayNo == 7) {
			dayName = "Sunday";
		} else {
			dayName="invalid";
		}
		System.out.println("The day is : "+dayName);
	}

}
