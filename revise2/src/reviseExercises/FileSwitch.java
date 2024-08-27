/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class FileSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userIn;

		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3  Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter option");
		userIn = scanner.nextInt();

		switch (userIn) {
		case 1:
			System.out.println("You have selected File");
			break;
		case 2:
			System.out.println("You have selected Add");
			break;
		case 3:
			System.out.println("You have selected Edit");
			break;
		case 4:
			System.out.println("You have selected Delete");
			break;
		case 5:
			System.out.println("You have selected Exit");
			break;
		default:
			System.out.println("Invalid option ");
		}
		scanner.close();

	}

}
