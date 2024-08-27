/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class SimpsonsChar {
	private String name;
	private String catchphrase;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the catchphrase
	 */
	public String getCatchphrase() {
		return catchphrase;
	}
	/**
	 * @param catchphrase the catchphrase to set
	 */
	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}public void saycatchphrase() {
		System.out.println(this.name+" says "+this.catchphrase);
	}

}
