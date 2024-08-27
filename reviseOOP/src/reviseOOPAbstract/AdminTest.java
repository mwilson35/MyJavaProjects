/**
 * 
 */
package reviseOOPAbstract;

/**
 * 
 */
public class AdminTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Employee employee= new Employee();
		employee.calculateSalary(34, 10);*/
		
		Lecturer l1=new Lecturer("Lecturer", "Smith", "CS");
				l1.calculateSalary(34, 10);
				
		Reader r1=new Reader("Mick", "Wil", "CS");
		r1.calculateSalary(34, 10);
		
	}

}
