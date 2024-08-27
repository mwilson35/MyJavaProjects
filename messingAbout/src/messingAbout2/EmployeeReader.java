/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class EmployeeReader extends Employee {
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * 
	 */
	public EmployeeReader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public EmployeeReader(String firstName, String lastName, String School) {
		super(firstName, lastName);
		this.school=school;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary(int hours, int base) {
		System.out.println("Wages lecturer : " + (hours * base * 3));

	}

}
