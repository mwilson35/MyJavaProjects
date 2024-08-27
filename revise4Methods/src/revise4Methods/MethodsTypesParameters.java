/**
 * 
 */
package revise4Methods;

/**
 * 
 */
public class MethodsTypesParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        MethodsTypesParameters methods = new MethodsTypesParameters();

		weekOfYear();
		//if you want to call a method in the main method it needs to be static, if undeclared.
		//        MethodsTypesParameters methods = new MethodsTypesParameters();
		//			you would need to create the class and invoke it with correct arguments
		methods.areaOfCircle(3.2);
		methods.areaOfTriangle(2.1, 4);

	}

	public static void weekOfYear() {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int dayOfMonth = cal.get(java.util.Calendar.WEEK_OF_YEAR);
		System.out.println("Week number is: " + String.valueOf(dayOfMonth));

	}

	public void areaOfCircle(double radius) {
		System.out.println("Area of circle : "+Math.PI*radius*radius);

	}
	public void areaOfTriangle(double breadth, double height) {
		double area= (breadth/2)*height;
		System.out.printf("Area : %.2f \n", area);
	}
}
