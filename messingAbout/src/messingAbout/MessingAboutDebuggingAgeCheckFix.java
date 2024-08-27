/**
 * 
 */
package messingAbout;
import java.util.Scanner;
/**
 * 
 */
public class MessingAboutDebuggingAgeCheckFix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {		
		int age = 0;
				
				System.out.print("Please enter your age: ");
				age = scanner.nextInt();
				System.out.println("Age was "+age);
				scanner.close(); 
	}catch(Exception exception) {
		System.out.println("Sorry error");
	}
	}
}
