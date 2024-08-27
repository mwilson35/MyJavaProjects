/**
 * 
 */
package challenges;

/**
 * 
 */
public class MobilePhone {
	private String phoneName;
	private int model;
	private int rating;
	/**
	 * @return the phoneName
	 */
	public String getPhoneName() {
		return phoneName;
	}
	/**
	 * @param phoneName the phoneName to set
	 */
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	/**
	 * @return the model
	 */
	public int getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(int model) {
		this.model = model;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		if(rating>0 && rating <=5) {
			this.rating=rating;
		}else {
			System.out.println("Enter number 1-5");
		}
	}
	@Override
	public String toString() {
		return "MobilePhone [phoneName=" + phoneName + ", model=" + model + ", rating=" + rating + "]";
	}
	public MobilePhone(String phoneName, int model, int rating) {
		super();
		this.phoneName = phoneName;
		this.model = model;
		this.rating = rating;
	}
	
	

}
