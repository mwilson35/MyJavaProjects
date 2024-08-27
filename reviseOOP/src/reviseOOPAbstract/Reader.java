/**
 * 
 */
package reviseOOPAbstract;

/**
 * 
 */
public class Reader extends Employee {

	private String research;

	/**
	 * 
	 */
	public Reader() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Reader(String firstName, String lastName, String research) {
		super(firstName, lastName);
		this.research = research;

	}

	/**
	 * @return the research
	 */
	public String getResearch() {
		return research;
	}

	/**
	 * @param research the research to set
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	@Override
	public void calculateSalary(int hours, int base) {
		System.out.println("Wages Reader : " + (hours * base * 3));
	}

}
