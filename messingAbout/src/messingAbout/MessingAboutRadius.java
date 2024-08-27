/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutRadius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int length;
		double radius, area;
		
		length=6;
		radius=9;
		
		System.out.println("Area calculator");
		System.out.println("Square");
		System.out.println("Length of square : "+length+"cm");
		System.out.println("Area of square\t : "+ length*length+"cm2");
		
		area=3.142*(radius*radius);
		System.out.printf("Area of circle\t %.3f cm2", area);
	}

}
