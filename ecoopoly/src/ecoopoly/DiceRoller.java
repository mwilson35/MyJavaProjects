/**
 * 
 */
package ecoopoly;

import java.util.Random;
import java.util.SortedSet;

/**
 * 
 */
public class DiceRoller {

	private static final Random random = new Random();

	public static int rollDice() {

		int diceRoll1 = (int) (Math.random() * 6) + 1;
		int diceRoll2 = (int) (Math.random() * 6) + 1;
		int roll = diceRoll1 + diceRoll2;

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~ You Roll The Dice ~~~");
		System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2);
		System.out.println("You will advance " + (diceRoll1 + diceRoll2) + " spaces");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

		return roll;
	}
}
