/**
 * 
 */
package reviseOOPAbstract;

/**
 * 
 */
public class Lecturer extends Employee {

	private String school;

	/**
	 * 
	 */
	public Lecturer() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Lecturer(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.school = school;
	}

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

	@Override
	public void calculateSalary(int hours, int base) {
		// TODO Auto-generated method stub
		System.out.println("Wages Lecturer : " + (hours * base * 2));
	}

}
