/**
 * 
 */
package messingAbout;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * 
 */
public class MessingAboutMastersMark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mastersMark;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your final mark : ");
		mastersMark = scanner.nextInt();

		if ((mastersMark >= 0) && (mastersMark <= 49)) {
			System.out.println("Fail");
		}
		else if ((mastersMark >= 50) && (mastersMark < 60)) {
			System.out.println("Pass");
		}
		else if ((mastersMark >= 60) && (mastersMark <= 69)) {
			System.out.println("Merit");
		}
		else if ((mastersMark >= 70) && (mastersMark <= 100)) {
			System.out.println("Distinction");
		} else {
			System.out.println("Error-please print out a number 0-100");
		}scanner.close();

	}

}
