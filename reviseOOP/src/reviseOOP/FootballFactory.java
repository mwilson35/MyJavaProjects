/**
 * 
 */
package reviseOOP;

/**
 * 
 */
public class FootballFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Footballer f1= new Footballer();
		f1.setFirstName("George");
		f1.setLastName("Best");
		f1.setSquadnumber(7);
		f1.setEmployeeNumber(23434);
		
		Footballer f2= new Footballer("Eric", "Cantona", 11, 124324);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
