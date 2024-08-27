/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class ReviseIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.println("please enter your final mark(0-100)");
		score = scanner.nextInt();

		if (score == 0 || score <= 49) {
			System.out.println("Fail");

		} else if (score == 50 || score <= 59) {
			System.out.println("Pass");
		} else if (score == 60 || score <= 69) {
			System.out.println("Merit");
		} else if (score == 70 || score <= 100) {
			System.out.println("Distinction");
		} else {
			System.out.println("Invalid, please enter no. between 1-100");
		}

	}

}
