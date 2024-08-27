/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class VotingSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String voterInput;
		System.out.println("Please enter 'con' for Conservative and 'lab' for Labour");
		voterInput = scanner.nextLine();

		if (voterInput.equalsIgnoreCase("con")) {
			System.out.println("Vote registered for Conservative");
		} else if (voterInput.equalsIgnoreCase("lab")) {
			System.out.println("Vote registered for Labour");
		} else {
			System.out.println("Voting party unrecognised");
		}
		scanner.close();
	}

}
