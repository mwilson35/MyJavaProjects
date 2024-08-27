/**
 * 
 */
package OOPCarClass2;

/**
 * 
 */
public class FamilySaloon2 extends Car2 {

	private boolean metallicPaint;
	
	

	/**
	 * default constructor
	 */
	public FamilySaloon2() {

	}

	/**
	 * constructor with args
	 * 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon2(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;

	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("Metallic paint \t: "+this.metallicPaint);
	}
}