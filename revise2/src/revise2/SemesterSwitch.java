/**
 * 
 */
package revise2;

import java.util.Scanner;

/**
 * 
 */
public class SemesterSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month;
		String semester;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter month e.g. 1-12");
		month=scanner.nextInt();
		scanner.close();
		
		
		switch(month) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 1:
			semester="semester 1";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			semester="semester 2";
			break;
		case 6:
		case 7:
		case 8:
			semester="summer";
			break;
			default:
				semester="invalid";
		}
		System.out.println(semester);
	}

}
