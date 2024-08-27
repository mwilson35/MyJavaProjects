/**
 * 
 */
package challenges;

/**
 * 
 */
public class AmazonBooks {
	private String title;
	private String author;
	private double pricePaper;
	private double priceHard;
	private double priceKindle;
	private double priceAudio;
	private int pages;
	private String isbn10;
	private double averageCustomerRating;
	private String language;
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
	 * @return the pricePaper
	 */
	public double getPricePaper() {
		return pricePaper;
	}
	/**
	 * @param pricePaper the pricePaper to set
	 */
	public void setPricePaper(double pricePaper) {
		this.pricePaper = pricePaper;
	}
	/**
	 * @return the priceHard
	 */
	public double getPriceHard() {
		return priceHard;
	}
	/**
	 * @param priceHard the priceHard to set
	 */
	public void setPriceHard(double priceHard) {
		this.priceHard = priceHard;
	}
	/**
	 * @return the priceKindle
	 */
	public double getPriceKindle() {
		return priceKindle;
	}
	/**
	 * @param priceKindle the priceKindle to set
	 */
	public void setPriceKindle(double priceKindle) {
		this.priceKindle = priceKindle;
	}
	/**
	 * @return the priceAudio
	 */
	public double getPriceAudio() {
		return priceAudio;
	}
	/**
	 * @param priceAudio the priceAudio to set
	 */
	public void setPriceAudio(double priceAudio) {
		this.priceAudio = priceAudio;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	/**
	 * @return the isbn10
	 */
	public String getIsbn10() {
		return isbn10;
	}
	/**
	 * @param isbn10 the isbn10 to set
	 */
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	/**
	 * @return the averageCustomerRating
	 */
	public double getAverageCustomerRating() {
		return averageCustomerRating;
	}
	/**
	 * @param averageCustomerRating the averageCustomerRating to set
	 */
	public void setAverageCustomerRating(double averageCustomerRating) {
		this.averageCustomerRating = averageCustomerRating;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "AmazonBooks [title=" + title + ", author=" + author + ", pricePaper=" + pricePaper + ", priceHard="
				+ priceHard + ", priceKindle=" + priceKindle + ", priceAudio=" + priceAudio + ", pages=" + pages
				+ ", isbn10=" + isbn10 + ", averageCustomerRating=" + averageCustomerRating + ", language=" + language
				+ "]";
	}
	public AmazonBooks(String title, String author, double pricePaper, double priceHard, double priceKindle,
			double priceAudio, int pages, String isbn10, double averageCustomerRating, String language) {
		super();
		this.title = title;
		this.author = author;
		this.pricePaper = pricePaper;
		this.priceHard = priceHard;
		this.priceKindle = priceKindle;
		this.priceAudio = priceAudio;
		this.pages = pages;
		this.isbn10 = isbn10;
		this.averageCustomerRating = averageCustomerRating;
		this.language = language;
	}
	
}
	
	