/**
 * 
 */
package revise3;

/**
 * 
 */
public class LoopsCountdownBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int loop=1000;loop>=0;loop--) {
			System.out.println(loop);
			if(loop==333) {
				System.out.println("launch aborted");
				break;
			}
		}
	}

}
