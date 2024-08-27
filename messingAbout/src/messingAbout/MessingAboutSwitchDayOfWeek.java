/**
 * 
 */
package messingAbout;

/**
 * 
 */
public class MessingAboutSwitchDayOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numDay;
		String dayOfWeek;
		
		numDay=6;
		
		if(numDay==1) {
		dayOfWeek="Sunday";
		}else if(numDay==2) {
			dayOfWeek="Monday";
		}else if (numDay==3) {
			dayOfWeek="Tuesday";
		}else if(numDay==4) {
			dayOfWeek="Wednesday";
		}else if(numDay==5) {
			dayOfWeek="Thursday";
		}else if (numDay==6) {
			dayOfWeek="Friday";
		}else if (numDay==7) {
			dayOfWeek="Saturday";
		}else {
			dayOfWeek="invalid";
		}System.out.println("That'll be  "+dayOfWeek);
	}

}
