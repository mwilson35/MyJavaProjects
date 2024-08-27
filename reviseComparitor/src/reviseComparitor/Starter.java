/**
 * 
 */
package reviseComparitor;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import reviseComparator.CompareByName;
import reviseComparator.CompareEmployeeAge;

/**
 * 
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 90;
		Integer b = 10;
		System.out.println(a.compareTo(b));

		Employee e1 = new Employee("Mick", 30);
		Employee e2 = new Employee("Fionn", 12);
		Employee e3 = new Employee("Amanda", 25);

		List<Employee> es = new ArrayList<>();
		es.add(e1);
		es.add(e2);
		es.add(e3);

		System.out.println("No sort");
		viewAll(es);
		
		
		//sort for age using comparator
		Collections.sort(es, new CompareEmployeeAge());
		System.out.println("Sort based on age: ");
		viewAll(es);
		
		//sort for name
		Collections.sort(es, new CompareByName());
		System.out.println("Sort based on name: ");
		viewAll(es);

	}

	private static void viewAll(List<Employee> es) {
		for (Employee e : es) {
			System.out.println(e.toString());
		}
	}

}
