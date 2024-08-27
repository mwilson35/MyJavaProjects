/**
 * 
 */
package reviseOOPInheritance;

/**
 * 
 */
public class StaffMember {
	private String title;
	private String firstName;
	private String lastName;

	// constructor
	public StaffMember() {

	}
	

	public StaffMember(String title, String firstName, String lastName) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StaffMember [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void displayAll() {
		System.out.println("Title         : "+this.title);
		System.out.println("First name    : "+this.firstName);
		System.out.println("Last name     : "+this.lastName);


	}
}
