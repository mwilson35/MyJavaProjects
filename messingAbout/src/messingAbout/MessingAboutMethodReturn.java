/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutMethodReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println(biggestNumber(10, 20) );
	}

	public static int biggestNumber(int num1, int num2) {
		int biggest;

		if (num1 > num2) {
			biggest = num1;
		} else {
			biggest = num2;

		}
		return biggest;

	}
}
