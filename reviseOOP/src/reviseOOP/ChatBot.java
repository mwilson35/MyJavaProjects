/**
 * 
 */
package reviseOOP;

/**
 * 
 */
public class ChatBot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		System.out.println("Starting chatbot");
		
		MessageGenie messageGenie = new MessageGenie();
		messageGenie.morningGreeting();
		messageGenie.afternoonGreeting();
		
		
		System.out.println("Ending chatbot");
	}

}
