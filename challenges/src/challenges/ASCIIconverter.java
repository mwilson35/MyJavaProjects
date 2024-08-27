/**
 * 
 */
package challenges;
import java.util.Scanner;
/**
 * 
 */
public class ASCIIconverter {
	public static final int SPACE_CHAR=32;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int userOption;
		String usersname, charToASCIIinput;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("\nASCII Convertor Menu................");
        System.out.println("1. Show ASCII Table");
        System.out.println("2. Convert a Character to ASCII");
        System.out.println("3. Convert your name to ASCII");
        System.out.println("4. Quit");

        System.out.println("Enter a number and return");

        // get a user's option
        userOption = scanner.nextInt();
        scanner.nextLine(); // this clears out the return character (nextInt takes just the int entered)
        
        switch(userOption) {
        case 1:
        	System.out.println("ASCII Table");
        	for(int loop=32;loop<128;loop++) {
        		System.out.println(loop+"\t" +(char)loop);
        	}
        	break;
        case 2:
        	System.out.println();
        }
	}
	
	

}
