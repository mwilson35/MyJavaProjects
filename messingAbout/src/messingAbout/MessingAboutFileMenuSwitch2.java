/**
 * 
 */
package messingAbout;

import java.util.Scanner;

/**
 * 
 */
public class MessingAboutFileMenuSwitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.File\n2.Add\n3.Edit\n4.Delete\n5.Exit\nEnter option");
		userInput=scanner.nextInt();
		
		switch(userInput) {
		case 1:
			System.out.println("You have selected File");
			break;
		case 2:
			System.out.println("You have selected Add ");
			break;
		case 3:
			System.out.println("You have selected Edit ");
			break;
		case 4:
			System.out.println("You have selected Delete ");
			break;
		case 5:
			System.out.println("You have selected Exit ");
			break;
			default:
				System.out.println("Invalid");
		}
	}

}
