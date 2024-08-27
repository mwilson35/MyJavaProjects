/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutArrays3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myArray = { 3, 5, 7, 8, 999, 23 };
		int sum;
		sum = 0;
		System.out.println("Index \tvalue");
		for (int loop = 0; loop < myArray.length; loop++) {
			;
			System.out.println(loop + "\t" + myArray[loop]);
			sum += myArray[loop];
		}
		System.out.println("total is : "+sum);
	}

}
