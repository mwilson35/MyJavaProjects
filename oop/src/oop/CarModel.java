/**
 * 
 */
package oop;

/**
 * 
 */
public class CarModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory c1= new CarFactory("Ford", "fiesta", "Blue", 4, 1.2, 110, false);
		CarFactory c2=new CarFactory("Peugeot", "308", "Silver", 4, 1.8, 130, false);
		CarFactory c3=new CarFactory("Ferrari", "F4", "Red", 2, 2.8, 230, false);
		
		CarFactory[] carFactories={c1,c2,c3};
		for(int loop=0;loop<carFactories.length;loop++) {
			System.out.println(carFactories[loop]);
		}
		}
	}

