/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutAgeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int votingAge;
		String name;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age : ");
		votingAge = scanner.nextInt();

		if (votingAge >= 18) {
			System.out.println("What is your name? ");
			name = scanner.next();
			System.out.println(name+ " " + votingAge);

		}else if((votingAge>=1) && (votingAge<18)){
			System.out.println("Too young to continue");
		}else {
			System.out.println("Sorry don't recognise your input");
		}scanner.close();
	}

}
