/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutPrintF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anInt=9;
		double aDouble=3.14;
		String aString="My String value";
		
		//%d is for decimal+int
		//%f is for doubles-floating point number
		//%s is for String values
		
		
		
		System.out.printf("An int value : %d",anInt);
		System.out.printf("\nA double value : %f",aDouble);
		System.out.printf("\nA String value is : %s",aString);
		System.out.printf("\nAll values int: %d double: %f string: %s", anInt, aDouble, aString);
		
	}

}
