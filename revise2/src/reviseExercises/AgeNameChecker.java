/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class AgeNameChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;

		System.out.println("Please enter your age: ");
		age = scanner.nextInt();
		scanner.nextLine();

		if (age >= 1 && age < 18) {
			System.out.println("Too young to continue");
		} else if (age >= 18 && age < 100) {
			System.out.println("please enter your name:");
			name = scanner.nextLine();
			System.out.println("Name: "+name+" age: "+age);
		} else {
			System.out.println("Sorry don't recognise input");
		}
		scanner.close();
	}

}
