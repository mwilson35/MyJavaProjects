/**
 * 
 */
package reviseExercises;

import java.util.Scanner;

/**
 * 
 */
public class PrintFandOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double userNo;
		System.out.println("Please enter a number to 4 decimal places");
		userNo=scanner.nextDouble();
		
		System.out.printf("Number rounded to two decimal places : %.2f", userNo);
		System.out.printf("\nNumber squared \t\t\t     : %.3f ", Math.sqrt(userNo));
		System.out.printf("\nNumber cubed \t\t\t     : %.3f", Math.pow(userNo, 3));
		System.out.printf("\nSquare root of number \t\t     : %.4f", Math.sqrt(userNo));
	}

}
