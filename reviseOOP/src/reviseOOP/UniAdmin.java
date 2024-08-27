/**
 * 
 */
package reviseOOP;

/**
 * 
 */
public class UniAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setName("Micko");
		s1.setAge(36);
		
		Student s2= new Student();
		s2.setName("Karolina");
		s2.setAge(35);
		
		System.out.println("S1 name is "+s1.getName());
		System.out.println("S1 age is "+s1.getAge());
		System.out.println("S2 name is "+s2.getName());
		System.out.println("S2 age is "+s2.getAge());
	}

}
