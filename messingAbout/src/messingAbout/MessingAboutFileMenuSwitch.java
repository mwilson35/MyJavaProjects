/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutFileMenuSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
		String menuChoice;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.File\n2.Add\n3.Edit\n4.Delete\n5.Exit\nEnter option");
		userInput = scanner.nextInt();
		if (userInput == 1) {
			menuChoice = "File";
			System.out.println("You have selected" + " " + menuChoice);
		}
		else if (userInput == 2) {
			menuChoice = "Add";
			System.out.println("You have selected" + " " + menuChoice);
		}
		else if (userInput == 3) {
			menuChoice = "Edit";
			System.out.println("You have selected" + " " + menuChoice);

		}
		else if (userInput == 4) {
			menuChoice = "Delete";
			System.out.println("You have selected" + " " + menuChoice);

		}
		else if (userInput == 5) {
			menuChoice = "Exit";
			System.out.println("You have selected" + " " + menuChoice+" Goodbye");
		}else {
			System.out.println("Invalid");
		}
	}
}
