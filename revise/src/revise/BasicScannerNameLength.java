/**
 * 
 */
package revise;

import java.util.Scanner;

/**
 * 
 */
public class BasicScannerNameLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String name;
		int namenum;
		
		System.out.println("Please input your name");
		name=scanner.nextLine();
		System.out.println("How many letters in a long name?");
		namenum=scanner.nextInt();
		if(namenum>name.length()) {
			System.out.println("you have a short name");
		}
		if (namenum<name.length()) {
			System.out.println("So you think you have a long name");
		}
		scanner.close();
		
	}

}
