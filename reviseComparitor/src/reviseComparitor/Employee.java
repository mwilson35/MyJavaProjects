/**
 * 
 */
package reviseComparitor;

/**
 * 
 */
public class Employee {
	private String name;
	private int age;
	
	public Employee() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//toString 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
