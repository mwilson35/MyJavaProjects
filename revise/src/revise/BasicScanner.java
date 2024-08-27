 /**
 * 
 */
package revise;

import java.util.Scanner;

/**
 * 
 */
public class BasicScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int age;
		System.out.println("What is your age?");
		age=scanner.nextInt();
		
		if(age<18) {
			System.out.println("You cannot vote");
		}
		if(age>=18) {
			System.out.println("You can vote");
		}
		scanner.close();
	}

}
