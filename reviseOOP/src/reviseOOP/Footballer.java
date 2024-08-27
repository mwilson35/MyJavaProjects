/**
 * 
 */
package reviseOOP;

/**
 * 
 */
public class Footballer {
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private int squadnumber;

	// constructor
	public Footballer() {
		System.out.println("In constructor");
	}
	/**
	 * Creates a football object with the given arguments set
	 * @param firstName
	 * @param lastName
	 * @param employeenumber
	 * @param squadNumber
	 */
	public Footballer(String firstName, String lastName, int employeenumber, int squadNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeNumber=employeenumber;
		this.setSquadnumber(squadNumber); //business rule this.setSquadnumber
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

	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the squadnumber
	 */
	public int getSquadnumber() {
		return squadnumber;
	}

	/**setting squad number with business rules
	 * @param squadnumber the squadnumber to set
	 */
	public void setSquadnumber(int squadnumber) {
		if(squadnumber>0 &&squadnumber<33) {
		this.squadnumber = squadnumber;
		}else {
			System.out.println("Sorry cannot use "+squadnumber);
		}
		
	}

	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", squadnumber=" + squadnumber + "]";
	}

}
