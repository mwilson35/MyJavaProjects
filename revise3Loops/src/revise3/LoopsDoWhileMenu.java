/**
 * 
 */
package revise3;

import java.util.Scanner;

/**
 * 
 */
public class LoopsDoWhileMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;

		do {
			System.out.println("Menu____________");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Exit");

			option = scanner.nextInt();

			if (option == 1) {
				System.out.println("Your option: File");
			} else if (option == 2) {
				System.out.println("Your option: Edit");
			} else if (option == 3) {
				System.out.println("Your option: Delete");
			} else if(option==4) {
				System.out.println("Your option: Exit");

			} else {
				System.out.println("Invalid");
			}
		} while (option != 4);
		System.out.println("program quitting");
	}
}
