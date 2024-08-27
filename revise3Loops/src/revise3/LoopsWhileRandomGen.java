/**
 * 
 */
package revise3;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class LoopsWhileRandomGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int userGuess;
		userGuess=-1;
		
		int randomNum= random.nextInt(10);
		
		while(randomNum!=userGuess) {
		System.out.println("Enter number to win!");
		userGuess=scanner.nextInt();
		}System.out.println("Success!");
		
		scanner.close();
		}
	}
