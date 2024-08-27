/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutMethodsParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printnametoScreen("Micko Flynn", 5);

	}

	public static void printnametoScreen(String name, int maxTimes) {
		for (int loop=1; loop <=maxTimes; loop++) {
			System.out.println(name);
		}
		
	}
}
