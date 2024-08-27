/**
 * 
 */
package revise3;

/**
 * 
 */
public class LoopsLeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int loop=1910;loop<=1990;loop++) {
			if(loop %4==0) {
				System.out.println(loop);
			}
		}
	}

}
