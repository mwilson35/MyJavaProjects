/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutSquareChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
/**
 * Draws the top or bottom horizontal length
 * @param length
 * @param borderChar
 */
	public static void drawHorizontal(int length, char borderChar) {
		for(int count=1; count<length;count++) {
			System.out.println(borderChar+ " ");
		}
		System.out.println(borderChar);

	}
}
