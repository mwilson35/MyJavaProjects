/**
 * 
 */
package reviseWrappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 */
public class ArraysListsShow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//define
		ArrayList<String> items = new ArrayList<>();
	
		items.add("Apples");
		items.add("Oranges");
		System.out.println(items.size());
		System.out.println(items.toString());
		items.add(0, "Pears");//adds an item to the 1st index
		System.out.println(items.toString());
		
		System.out.println("Has apples "+items.contains("Apples"));// tells us if there's apples true or false
		items.set(0, "Bananas");//sets the 1st item and replaces it rather than move things along
		System.out.println(items.toString());
		
		String theValue=items.get(0);
		System.out.println(theValue);
		
		//import Collections class, .sort alphabetical for Strings
		Collections.sort(items);
		System.out.println(items.toString());
		
		//removal of an array item
		items.remove(1);
		System.out.println(items.toString());
		System.out.println(items.size());
	}

}
