/**
 * 
 */
package OOPCarClass2;

/**
 * @author TP COMPUTERS
 */
public class Car2 {

	private String make;
	private String model;
	private int horsePower;

	/**
	 * default constructor
	 */
	public Car2() {
		// TODO Auto-generated constructor stub
	}

	public Car2(String make, String model, int horsePower) {

		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower); 
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower >= 0 && horsePower <= 999) {
			this.horsePower = horsePower;

		} else {
			this.horsePower = -999;
		}
		
	}
	/**
	 * method to display all
	 */
	public void displayAll() {
		System.out.println("Make  \t:"+this.make);
		System.out.println("Model \t:"+this.model);
		System.out.println("Horsepower \t:"+this.horsePower);


		
	}
}
