/**
 * 
 */
package revise2;

import java.util.Scanner;

/**
 * 
 */
public class IfElseCreditHistory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age;
		boolean creditHistoryGood;
		
		creditHistoryGood=true;
		
		System.out.println("Please enter your age ");
		age=scanner.nextInt();
		if(age>=18 && creditHistoryGood) {
			System.out.println("Your application is being processed");
		}else {
			System.out.println("Your application has been denied");
		}
		scanner.close();
		
	

	}

}
