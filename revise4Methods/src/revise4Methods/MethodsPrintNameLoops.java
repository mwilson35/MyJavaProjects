/**
 * 
 */
package revise4Methods;

/**
 * 
 */
public class MethodsPrintNameLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		nameLoop(1, 3);

	}

	public static void nameLoop(int start, int end) {
		String name;
		name="Mick";
		for( int loop=start;loop<=end;loop++) {
			System.out.println(name);
		}
	}
}
