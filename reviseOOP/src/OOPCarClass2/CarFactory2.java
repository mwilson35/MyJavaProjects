/**
 * 
 */
package OOPCarClass2;

/**
 * 
 */
public class CarFactory2 {
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		FamilySaloon2 fs1=new FamilySaloon2("Audi", "A3", 130, true);
		RallyCar r1=new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon2 fs2=new FamilySaloon2("Subaru", "Legacy", 123, true);
		
		//creating array of cars
		Car2[] cars= {fs1,r1,fs2};
		//showing all car details
		showAllCarDetails(cars);
		outLeastHP(cars);
	}
	public static void showAllCarDetails(Car2[]cars) {
		for (Car2 c: cars) {
			System.out.println();
			c.displayAll();
		}
	}
	public static void outLeastHP(Car2[]cars) {
		int min=cars[0].getHorsePower();
		String leastHPModel=cars[0].getModel();
		
		for(Car2 c: cars) {
			if(c.getHorsePower()<min) {
				min=c.getHorsePower();
				leastHPModel=c.getModel();
			}
		}
		System.out.println("Min HP "+leastHPModel);
	}
}
