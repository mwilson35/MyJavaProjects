/**
 * 
 */
package revise;

/**
 * 
 */
public class BasicShapeArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pi, circleArea;
		int length, area, radius;
		pi=3.142;
		radius=9;
		length=6;
		area = length*length;
		circleArea=pi*(radius*radius);
		
		System.out.println("The area of the square is : "+ area);
		System.out.printf("The area of the circle is : %.3f ",circleArea);
	}

}
