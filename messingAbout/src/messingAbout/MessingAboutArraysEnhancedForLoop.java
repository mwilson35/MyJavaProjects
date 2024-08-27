/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutArraysEnhancedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myArray = { 3, 5, 7, 8, 999, 23 };
		int[] anotherArray = { 2, 4, 6, 8,4,4,4,4};
		int sum;
		sum = 0;
		for(int number : myArray) {
			System.out.println(number);
		}
	}

}
