/**
 * 
 */
package revise3;



/**
 * 
 */
public class LoopsNested {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int outer = 1; outer < 4; outer++) {
			for (int inner = 1; inner < 6; inner++) {
				System.out.println(outer +" "+ inner+ " ");
			}
			System.out.println();
		}

	}

}
