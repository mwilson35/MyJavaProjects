/**
 * 
 */
package reviseEnums;

/**
 * 
 */
public class Books {
	private String name;
	private BookGenre genre;
	
	
	public Books(String name, BookGenre genre) {
		this.name = name;
		this.genre = genre;
	}
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
	 * @return the genre
	 */
	public BookGenre getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}
	
	

}
