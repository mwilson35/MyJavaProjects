/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutMenuSwitchDoWhile {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You selected Option 1");
				// Add code for Option 1 here
				break;
			case 2:
				System.out.println("You selected Option 2");
				// Add code for Option 2 here
				break;
			case 3:
				System.out.println("You selected Option 3");
				// Add code for Option 3 here
				break;
			case 4:
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option.");
			}
		} while (choice != 4);

		scanner.close();
	}

}

