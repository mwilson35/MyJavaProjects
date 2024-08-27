/**
 * 
 */
package messingAbout2;

/**
 * This class will output several quotes
 * 
 * @author TP COMPUTERS
 */
public class Quotes {

	/**
	 * This method outputs shakespeare
	 */
	public void shakespeareQuote() {
		System.out.println(
				"Good night, good night! Parting is such a sweet sorrow, that I shall say goodnight till it be morrow");

	}

	public void wildeQuote() {
		System.out.println("Experience is simply the name we give to our mistakes");
	}public void einsteinQuote() {
		System.out.println("If the facts don't fit the theory, change the facts.");
	}



	public static void main(String args[]) {
		Quotes quotes= new Quotes();
		quotes.shakespeareQuote();
		quotes.wildeQuote();
		quotes.einsteinQuote();
	}
}
