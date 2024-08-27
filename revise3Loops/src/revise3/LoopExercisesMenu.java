/**
 * 
 */
package revise3;

import java.util.Scanner;

/**
 * 
 */
public class LoopExercisesMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput;

		do {
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Select option");
			userInput = scanner.nextInt();
			

			if (userInput == 1) {
				System.out.println("File selected");

			} else if (userInput == 2) {
				System.out.println("Edit selected");
			} else if (userInput == 3) {
				System.out.println("Save selected");
			} else if (userInput == 4) {
				System.out.println("Delete selected");
			} else if (userInput == 5) {
				System.out.println("Exit seleceted");
			} else {
				System.out.println("Invalid choice");
			}
		} while (userInput != 5);
		System.out.println("Quitting program");
		scanner.close();
	} 
}