/**
 * 
 */
package revise4Methods;

/**
 * 
 */
public class MethodsMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		min(10, 12);

	}

	public static void min(int num1, int num2) {

		if (num1 < num2) {
			System.out.println("min " + num1);

		}
		if (num2 < num1) {
			System.out.println("min " + num2);
		}
	}

}
