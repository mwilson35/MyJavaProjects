/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class IfElseProjectMarker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int finalMark;

		System.out.println("Enter mark: ");
		finalMark = scanner.nextInt();

		if (finalMark >= 70 && finalMark <= 100) {
			System.out.println("Distinction");
		} else if (finalMark > 0 && finalMark < 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Invalid");
			scanner.close();
		}
		

	}

}
