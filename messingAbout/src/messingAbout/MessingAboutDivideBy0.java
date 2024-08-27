/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutDivideBy0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int num1, num2, ans;
			num1 = 9;
			num2 = 0;
			ans = num1 / num2;
			System.out.println(ans);

		} catch (ArithmeticException exception) {
			System.out.println("Sorry cant divide by zero");
		} catch (Exception exception) {
			System.out.println("Sorry had a problem");
		} finally {
			// could close resources here
			System.out.println("Thanks for using the app");
		}
	}
}