/**
 * 
 */
package revise4Methods;

/**
 * 
 */
public class MethodsReturnType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println("Biggest number is : "+ biggestNumber(2, 4));
	System.out.println("Biggest number is : "+ biggestNumber(10, 4));

	}public static int biggestNumber(int num1, int num2) {
		int biggest;
		
		if(num1>num2) {
			biggest=num1;
		}else {
			biggest=num2;
		}
		return biggest;
	}

}
