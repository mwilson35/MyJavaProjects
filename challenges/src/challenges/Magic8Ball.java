/**
 * 
 */
package challenges;

/**
 * @author Micko
 */
import java.util.Scanner;
import java.util.Random;
public class Magic8Ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String userQ;
		int randoNum;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("What is your question? ");
		userQ=scanner.nextLine();
		System.out.println("You have asked : "+ userQ);
		
		randoNum=random.nextInt(8);
		randoNum++;
		
		switch (randoNum) {
		case 1 : 
		 System.out.println("As I see it, yes");
		 break;
		case 2:
			System.out.println("Ask again later");
			break;
		case 3:
			System.out.println("Better not tell now.");
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
			System.out.println("It is decidedly so");
			break;
			default:
				System.out.println("Problem");
		}
		scanner.close();
		
	}

}
