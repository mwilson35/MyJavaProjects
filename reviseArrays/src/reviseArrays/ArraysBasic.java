/**
 * 
 */
package reviseArrays;

/**
 * 
 */
public class ArraysBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myArray = new int[5];
		int[] myArray2 = { 3, 5, 7, 8, 999, 888, 123 };
		int sum;
		sum=0;
		System.out.println("Index \tValue");
		for (int loop = 0; loop < myArray2.length; loop++) {
			System.out.println(loop + " \t" + myArray2[loop]);
			sum+=myArray2[loop];

			/*
			 * int number = myArray2[4]; System.out.println("Array2 " + number);
			 * 
			 * System.out.println(myArray[0]);
			 * 
			 * myArray[0] = 999; System.out.println(myArray[0]);
			 * 
			 * myArray[4] = 4444; System.out.println(myArray[4]);
			 */

		}System.out.println("Total is : "+sum);
	}
}
