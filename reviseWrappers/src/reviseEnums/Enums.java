/**
 * 
 */
package reviseEnums;

/**
 * 
 */
public class Enums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Colour colour = Colour.BLUE;

		System.out.println(colour);

		switch (colour) {
		case BLUE:
			System.out.println("Colour was blue");
			break;
		case GREEN:
			System.out.println("Colour was green");
			break;
		case RED:
			System.out.println("Colour was red");
			break;
		default :
			System.out.println("Unknown");

		}

	}

}
