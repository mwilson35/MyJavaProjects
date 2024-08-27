/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class BookTest {
	private int pagesNo;
	private String author;
	private String title;
	private String genre;

	@Override
	public String toString() {
		return "BookTest [pagesNo=" + pagesNo + ", author=" + author + ", title=" + title + ", genre=" + genre + "]";
	}

	/**
	 * @return the pagesNo
	 */
	public int getPagesNo() {
		return pagesNo;
	}

	/**
	 * @param pagesNo the pagesNo to set
	 */
	public void setPagesNo(int pagesNo) {
		this.pagesNo = pagesNo;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * 
	 */
	public BookTest() {
		this.title = title;
		this.author=author;
		this.pagesNo=pagesNo;
		this.genre=genre;
	}

}
