/**
 * 
 */
package reviseArrays;

/**
 * 
 */
public class Arrays2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] my2D= new int [3][4];
		
		//assigning values
		my2D[0][0]=1;
		my2D[0][3]=8;
		my2D[1][2]=64;
		my2D[1][2]=128;
		my2D[2][0]=256;
		my2D[2][3]=2048;
		
		for(int row=0; row<my2D.length;row++) {
			for(int col=0;col<my2D[row].length;col++) {
				System.out.print(my2D[row][col]+"\t");
			}System.out.println();
		}
	
	}
}
