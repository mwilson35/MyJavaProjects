/**
 * 
 */
package reviseArrays;

/**
 * 
 */
public class ArraysPopulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]myArray=new int[10];
		
		//populate the array
		for(int loop=0;loop<myArray.length;loop++) {
			myArray[loop]=2+2*loop;
		}
		for(int loop=0;loop<myArray.length;loop++) {
			System.out.println(myArray[loop]+" ");
		}
	}

}
