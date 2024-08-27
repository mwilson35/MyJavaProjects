/**
 * 
 */
package revise4Methods;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 */
public class MethodsIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// namePrint();
		//namePrint100();
		//namePrint1000();
		yearBirthday(36);

	}

	public static void namePrint() {
		System.out.println("Micko");
	}

	public static void namePrint100() {
		String name;
		name = "Mick";

		for (int loop = 1; loop <= 10; loop++) {
			System.out.println(name);
		}

	}

	public static void namePrint1000() {
		String name;
		name= "micko";
		for(int loop=1;loop<=1000;loop++) {
			System.out.println(name);
		}

	}public static void yearBirthday(int currentAge) {
		int oneHundo, year;
		
		
		year= java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		oneHundo=100-currentAge+year;
		System.out.println(oneHundo);
		
		
		
	
		}
		
		
	}

