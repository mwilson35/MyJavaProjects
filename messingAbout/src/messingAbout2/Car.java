/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class Car extends VehicleCarShip {
	private int numberOfWheels;
	

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	/**
	 * @param name
	 * @param powerType
	 */
	public Car(String name, String powerType) {
		super(name, powerType);
		this.setName(name);
		this.setPowerType(powerType);
		this.numberOfWheels=numberOfWheels;
		// TODO Auto-generated constructor stub
	}

}
