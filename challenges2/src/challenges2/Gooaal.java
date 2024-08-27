/**
 * 
 */
package challenges2;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Gooaal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] saves = new int[5];
		System.out.println("Game on....");
		fillSavePositions(saves);
		playTheGame(saves);
		System.out.println("Thanks for playing");

	}

	private static void fillSavePositions(int[] saves) {
		Random random = new Random();
		for (int savePosition = 0; savePosition < saves.length; savePosition++) {
			saves[savePosition] = random.nextInt(9) + 1;
		}
	}

	private static void playTheGame(int[] saves) {
		Scanner scanner = new Scanner(System.in);
		int userShot, userScore, pen;
		userScore = 0;
		pen = 1;

		for (int savePosition = 0; savePosition < saves.length; savePosition++) {
			System.out.println("Penalty number : " + pen + " out of " + saves.length);
			displayGoals();

			System.out.println("Select shot....");
			userShot = scanner.nextInt();

			System.out.print("Placing the ball ... ");
			delay(500);
			System.out.print("Walking back ... ");
			delay(500);
			System.out.print("Run up... ");
			delay(100);
			System.out.print("SHOOT ! ");
			System.out.println();
			delay(1000);

			if (userShot == saves[savePosition]) {
				// save !
				System.err.println("SAVE ! ");
			} else {
				// goal !
				System.err.println("GOAL ! ");
				System.out.println("Keeper went to " + saves[savePosition]);
				// update score
				userScore++;
			}
			System.out.println();
			delay(1000);
			pen++;

		}
		System.out.println("Goals scored : " + userScore + "/" + saves.length);
		System.out.println(assessPerformanace(userScore));
		scanner.close();
	}

	private static void displayGoals() {
		System.out.println("\t\t_______________________");
		System.out.println("\t\t| 1 2 3 |");
		System.out.println("\t\t| 4 5 6 |");
		System.out.println("\t\t| 7 8 9 |");
		System.out.println("_____________________________________________________\n\n");
		System.out.println("\t\t X ");
		System.out.println("\n");
	}

	private static void delay(int millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String assessPerformanace(int userScore) {
		String performanceMessage;
		switch (userScore) {
		case 0:
			performanceMessage = "You have disgraced your country and family!";
			break;
		case 1:
			performanceMessage = "You have disgraced your country!";
			break;
		case 2:
			performanceMessage = "Back to training for you!";
			break;
		case 3:
			performanceMessage = "Try using your good foot!";
			break;
		case 4:
			performanceMessage = "Not bad - but not perfect!";
			break;
		case 5:
			performanceMessage = "Fluke and the keeper is not very good anyway!";
			break;
		default:
			performanceMessage = "I don't know what to say about that one";
		}
		return performanceMessage;
	}
}
