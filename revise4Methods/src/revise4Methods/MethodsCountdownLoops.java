/**
 * 
 */
package revise4Methods;

/**
 * 
 */
public class MethodsCountdownLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		countDown(10);

	}public static void countDown(int start) {
		for(int loop=start;loop>=0;loop--) {
			System.out.println(loop);
		}
	}

}
