/**
 * 
 */
package challenges2;

import java.util.Scanner;

/**
 * 
 */
public class LoopSquareMeUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char borderChar;
		int userLength;
		System.out.println("Enter length of side");
		userLength = scanner.nextInt();
		System.out.println("Enter a character to build with");
		borderChar = scanner.next().charAt(0);
		
		drawHorizontal(userLength, borderChar);
		drawSides(userLength, borderChar);
		drawHorizontal(userLength, borderChar);
		scanner.close();

	}

	public static void drawHorizontal(int length, char borderChar) {
		for (int count = 1; count < length; count++) {
			System.out.print(borderChar + "  ");
		}
		System.out.print(borderChar);
		System.out.println();
	}

	public static void drawSides(int length, char borderChar) {
		for (int count = 1; count < length - 1; count++) {
			System.out.print(borderChar+"  ");
			for(int side=1;side <length-1;side++) {
				System.out.print("   ");
			}System.out.print(borderChar);
			System.out.println();
		
		}
	}

}
