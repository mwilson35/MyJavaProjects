/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutDeBugging {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int myArray[] = { 2, 5, 7, 8 };

			for (int count = 0; count < 5; count++) {
				System.out.println(myArray[count]);
			}
			System.out.println("End of program");
		} catch (Exception exception) {
			System.out.println("Sorry had a problem");
		}
	}

}
