/**
 * 
 */
package reviseExercises;

/**
 * 
 */
public class DaySwitcherSwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int day;
		String dayWeek;

		day = 4;

		switch (day) {
		case 1:
			dayWeek = "Monday";
			break;
		case 2:
			dayWeek = "Tuesday";
			break;
		case 3:
			dayWeek = "Wednesday";
			break;
		case 4:
			dayWeek = "Thursday";
			break;
		case 5:
			dayWeek = "Friday";
			break;
		case 6:
			dayWeek = "Saturday";
			break;
		case 7:
			dayWeek = "Sunday";
			break;
		default:
			dayWeek = "invalid";
		}
		System.out.println(dayWeek);
	}

}
