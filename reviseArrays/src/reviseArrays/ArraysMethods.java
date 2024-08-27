/**
 * 
 */
package reviseArrays;

/**
 * 
 */
public class ArraysMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum;
		sum = 0;
		int[] myArray = { 3, 5, 7, 8, 78 };
		int[] anotherArray = { 2, 4, 6, 8 };
		
		//displayArray(anotherArray);
		
		//enhanced FOR loop
		for(int number: myArray) {
			System.out.println(number );
		}

		/*
		 * System.out.println("Index \tvalue"); for (int loop = 0; loop <
		 * myArray.length; loop++) { System.out.println(loop + " \t" + myArray[loop]); }
		 * for (int loop = 0; loop < anotherArray.length; loop++) {
		 * System.out.println(loop + " \t" + anotherArray[loop]); }
		 */
	}

	public static void displayArray(int[] anArray) {
		for(int loop=0; loop<anArray.length;loop++) {
			System.out.println(anArray[loop]);
		}
	}
}
