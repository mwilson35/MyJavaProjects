/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class EmployeeAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	Employee e1=new Employee("Dave", "Mustaine");
		//e1.calculateSalary(34, 10);
		EmployeeLecture l1= new EmployeeLecture("Mick", "Will", "Queens");
		l1.calculateSalary(34, 10);
		EmployeeReader r1= new EmployeeReader("Will", "Mick", "Queens");
		r1.calculateSalary(34, 10);
		
		System.out.println(l1.toString());
	}

}
