/**
 * 
 */
package oop;

/**
 * 
 */
public class CarFactory {
	private String make;
	private String model;
	private String colour;
	private int numOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;

	
	public CarFactory(String make, String model, String colour, int numOfDoors, double engineSize, int maxSpeed,
			boolean started) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numOfDoors = numOfDoors;
		this.engineSize = engineSize;
		this.maxSpeed = maxSpeed;
		this.started = started;
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
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the numOfDoors
	 */
	public int getNumOfDoors() {
		return numOfDoors;
	}

	/**
	 * @param numOfDoors the numOfDoors to set
	 */
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	/**
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}

	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}

	@Override
	public String toString() {
		return "CarFactory [make=" + make + ", model=" + model + ", colour=" + colour + ", numOfDoors=" + numOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}

	public void startCar() {
		if (this.started) {
			System.out.println("Engine running");
		} else {
			System.out.println("Car started");
		}
	}

	public void stopCar() {
		if (!this.started) {
			System.out.println("Car not started");
		} else {
			System.out.println("Car stopped");
		}
	}

}
