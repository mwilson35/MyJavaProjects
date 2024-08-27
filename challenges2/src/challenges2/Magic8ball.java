/**
 * 
 */
package challenges2;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Magic8ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String userQ;

		System.out.println("What is your question?");
		userQ = scanner.nextLine();
		System.out.println("You want to know \n" + userQ);

		int randomNumber = random.nextInt(8);
		switch (randomNumber) {
		case 1:
			System.out.println("As I see it, yes.");
			break;
		case 2:
			System.out.println("Ask again later");
			break;
		case 3:
			System.out.println("Better not tell you now");
			break;
		case 4:
			System.out.println("Cannot predict now");
			break;
		case 5:
			System.out.println("Concentrate and ask again");
			break;
		case 6:
			System.out.println("Don't count on it");
			break;
		case 7:
			System.out.println("It is certain");
			break;
		case 8:
			System.out.println("it is decidedly so");
			break;

		}
		scanner.close();

	}

}
