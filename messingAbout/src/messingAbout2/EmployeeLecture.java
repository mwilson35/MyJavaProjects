/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class EmployeeLecture extends Employee {
	private String school;

	/**
	 * @return the school
	 * 
	 * 
	 *         /**
	 * 
	 */
	public EmployeeLecture() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public EmployeeLecture(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.school=school;
	}

	@Override
	public void calculateSalary(int hours, int base) {
		// TODO Auto-generated method stub
		System.out.println("Wages lecturer : " + (hours * base*2));
		}

	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

}
