/**
 * 
 */
package revise3;

import java.util.Scanner;

/**
 * 
 */
public class LoopExercisesPrintName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName;
		System.out.println("Enter your name: ");
		userName = scanner.next();

		for (int loop = 1; loop <= 10; loop++) {
			System.out.println(userName);
			scanner.close();
		}

	}
}
