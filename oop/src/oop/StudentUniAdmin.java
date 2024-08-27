/**
 * 
 */
package oop;

/**
 * 
 */
public class StudentUniAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("Micko");
		s1.setAge(35);
		
		Student s2=new Student();
		s2.setName("Monica");
		s2.setAge(36);
		
		System.out.println("S1 name: "+s1.getName());
		System.out.println("S2 name: "+s2.getName() +" S2 age: "+s2.getAge());
		
	}

}
