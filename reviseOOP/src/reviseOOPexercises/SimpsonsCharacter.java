/**
 * 
 */
package reviseOOPexercises;

/**
 * Class for Simpsons characters and their catchphrases
 * 
 * @author TP COMPUTERS
 */
public class SimpsonsCharacter {

	private String name;
	private String catchPhrase;

	/**
	 * sets name of char
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets name of char
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}

	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	/**
	 * Method will output characters cathphrase
	 */
	public void sayCatchPhrase() {
		System.out.println(this.name + " says "+this.catchPhrase);

	}
}
