/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public abstract class Employee {
	private String firstName;
	private String lastName;

	public Employee() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		super();
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

	public abstract void calculateSalary(int hours, int base);

}
