/**
 * 
 */
package revise2;

/**
 * 
 */
public class SwitchMonthSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month;
		String season;
		
		month=11;
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="spring";
			break;
		case 6:
		case 7:
		case 8:
			season="summer";
			break;
		case 9:
		case 10:
		case 11:
			season="Autumn";
			break;
		default:
			season="invalid";
		}
		System.out.println(season);
	}

}
