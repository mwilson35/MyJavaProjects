package oop;

public class ChatBot {

	public ChatBot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Starting chatbot");
		MessageGenie messageGenie = new MessageGenie();
		messageGenie.morningGreeting();
		MessageGenie messageGenie2 = new MessageGenie();
		messageGenie.afternoonGreeting();
		
		
		System.out.println("Ending chatbot");

	}

}
