/**
 * 
 */
package revise2;

/**
 * 
 */
public class SemesterMonthSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month;
		String semesterName;

		month = 2;
		if((month==1) || (month>=9) && (month<=12)){
			System.out.println("Semester 1");
		}
		else if((month>=2) &&(month<=6)){
			System.out.println("Semester 2");
		}
		else {
			System.out.println("Summer");
		}
	}
}
