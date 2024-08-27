/**
 * 
 */
package reviseWrappers;

import java.util.ArrayList;

/**
 * 
 */
public class MountainSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mountain m1 = new Mountain("Everest", 8000);
		Mountain m2 = new Mountain("Donard", 860);

		ArrayList<Mountain> mountains = new ArrayList<>();
		mountains.add(m1);
		mountains.add(m2);

		System.out.println(mountains.size());
		displayAllMountainDetails(mountains);

	}
	public static void displayAllMountainDetails(ArrayList<Mountain>mountains) {
		for(Mountain mountain: mountains) {
			System.out.println(mountain.getName()+" "+mountain.getHeight());
		}
		
	}

}
