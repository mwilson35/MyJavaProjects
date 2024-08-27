/**
 * 
 */
package OOPCarClass2;

/**
 * 
 */
public class RallyCar extends Car2 {
	private double area;

	/**
	 * default constructor
	 */
	public RallyCar() {
		
	}

	/**
	 * with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area=area;
		
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void displayAll() {
		System.out.println("Rally car");
		super.displayAll();
		System.out.println("Area \t: "+this.area);
		
	}

}
