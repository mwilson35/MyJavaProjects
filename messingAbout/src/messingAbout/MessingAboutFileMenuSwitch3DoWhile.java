/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutFileMenuSwitch3DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int enterOption;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter option : ");
			enterOption = scanner.nextInt();
			System.out.println("Option was "+ enterOption);
		} while (enterOption != 4);
		System.out.println("Exit");
		scanner.close();
	}

}
