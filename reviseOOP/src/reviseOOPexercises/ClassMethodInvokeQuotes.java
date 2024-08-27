/**
 * 
 */
package reviseOOPexercises;

/**
 * This class will output to screen several quotes
 * 
 * @author TP COMPUTERS
 */
public class ClassMethodInvokeQuotes {
	/**
	 * this method outputs shakespeare
	 */

	public void shakespeareQuote() {
		System.out.println(
				"Good night, good night! Parting is such a sweet sorrow, that I shall say good night till it be morrow");
	}

	/**
	 * Outputs Wilde
	 */
	public void wildeQuote() {
		System.out.println("Experience is simply the name we give our mistakes");
	}

	/**
	 * testing of class
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		ClassMethodInvokeQuotes classMethodInvokeQuotes = new ClassMethodInvokeQuotes();
		classMethodInvokeQuotes.shakespeareQuote();
		classMethodInvokeQuotes.wildeQuote();
	}
}
