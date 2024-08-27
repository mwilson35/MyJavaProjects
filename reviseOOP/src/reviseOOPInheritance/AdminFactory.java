/**
 * 
 */
package reviseOOPInheritance;

/**
 * 
 */
public class AdminFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			StaffMember s1 = new StaffMember();
			s1.setFirstName("Mick");
			s1.setLastName("Will");
			
			System.out.println(s1.toString());
			
			Doctor d1=new Doctor();
			d1.setWard(7);
			d1.setFirstName("Dr");
			d1.setLastName("Cheeks");
			
			Programmer p1= new Programmer();
			p1.setLanguage("java");
			p1.setFirstName("Bill");
			p1.setLastName("Gates");
			
			System.out.println(d1.toString());
			
			StaffMember staff1= new StaffMember("Dr", "John", "Kerr");
			staff1.displayAll();
			
			Doctor d2 = new Doctor("Dr", "Micko", "Joe", 7);
			d2.displayAll();
	}
	

}
