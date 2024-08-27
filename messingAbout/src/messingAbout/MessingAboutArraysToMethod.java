/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutArraysToMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myArray = { 3, 5, 7, 8, 999, 23 };
		int[] anotherArray = { 2, 4, 6, 8,4,4,4,4};
		int sum;
		sum = 0;
		displayArray(anotherArray);
		/*
		 * System.out.println("Index \tvalue"); for (int loop = 0; loop <
		 * myArray.length; loop++) { ; System.out.println(loop + "\t" + myArray[loop]);
		 * } for (int loop = 0; loop < anotherArray.length; loop++) {
		 * 
		 * System.out.println(loop + "\t" + anotherArray[loop]);
		 */
		}

	
	public static void displayArray(int[] anArray) {
		for(int loop=0; loop<anArray.length;loop++) {
			System.out.println(anArray[loop]);
		}
		
	}
}