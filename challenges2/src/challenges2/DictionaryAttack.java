/**
 * 
 */
package challenges2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Back in 2009, a company named RockYou was hacked. This wouldn't have been too
 * much of a problem if they hadn't stored all of their passwords unencrypted,
 * in plain text for an attacker to see. They downloaded a list of all the
 * passwords and made it publicly available. This program prompts the user for a
 * password and checks the RockYou.txt WordList for a match.
 */
public class DictionaryAttack {

	/**
	 * Starting here 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Password checker");

		boolean passwordFound = false;
		Scanner scanner = new Scanner(System.in);
		String userPassword;
		File file = new File("rockyou.txt");

		// get user input
		System.out.println("Enter a password to check for common usage");
		userPassword = scanner.nextLine();

		System.out.println("Ok let's check that one ... ");
		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// populate the 2d array of the values..
			String line = bufferedReader.readLine();

			while (line != null && !passwordFound) {
				// if you want to print out each password - warning takes ages !
				// System.out.println(line);
				if (line.equals(userPassword)) {

					passwordFound = true;
				}
				line = bufferedReader.readLine();
			}
			fileReader.close();
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Hmmm couldn't find the Word List !");

		} catch (IOException e) {
			System.out.println("Well, I had a problem reading the Word List  !");
		} catch (Exception e) {
			System.out.println("Now that's a real problem ! Something bad happened.");
		}

		// check if password has been found and let user know outcome
		if (passwordFound) {
			System.out.println("Weak password ! Try another ");
		} else {
			System.out.println("Password not found.. could be a good one to use ");
		}
		System.out.println("Bye");
	}
}