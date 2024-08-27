/**
 * 
 */
package revise3;

import java.util.Scanner;

/**
 * 
 */
public class LoopsDoWhileAgeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;

		do {
			System.out.println("Please enter your age: ");
			age = scanner.nextInt();
			scanner.nextLine();
		} while (age < 1 || age > 120);

		if (age == 1 && age <= 30) {
			System.out.println("You are young");
		} else if (age == 31 && age <= 60) {
			System.out.println("You are getting on!");
		} else if (age == 61 && age <= 120) {
			System.out.println("You look amazing for your age!");
		} else {
			System.out.println("Invalid try again");
		}

	}
}
