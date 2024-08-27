/**
 * 
 */
package reviseOOPInheritance;

/**
 * 
 */
public class Doctor extends StaffMember {

	private int ward;

	// constructor
	public Doctor() {

	}

	/**
	 * inheriting
	 * 
	 * @param title
	 * @param firstName
	 * @param lastName
	 * @param ward
	 */
	public Doctor(String title, String firstName, String lastName, int ward) {
		super(title, firstName, lastName);
		this.ward = ward;

	}

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return "Doctor [ward=" + ward + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}

	/**
	 * Method from adminfactory
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Ward  : " + this.ward);
	}

}
