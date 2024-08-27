/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutVoteChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String partyVote, partyFullname;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'con' for Conservative and 'lab' for labour");
		partyVote = scanner.next();
		if (partyVote.equalsIgnoreCase("con") || partyVote.equalsIgnoreCase("lab")) {
			partyFullname = partyVote.equalsIgnoreCase("con") ? "Conservative" : "Labour";
			System.out.println("Voted registered for " + partyFullname);
		} else {
			System.out.println("Unrecognised input");
		}
		scanner.close();
	}

}
