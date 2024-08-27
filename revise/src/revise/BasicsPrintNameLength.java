/**
 * 
 */
package revise;

/**
 * 
 */
public class BasicsPrintNameLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString;
		myString= "Mick";
		
		System.out.println("My name is "+myString);
		System.out.println("Number of characters in name :"+myString.length());
		System.out.println("1st character is : "+myString.charAt(0));
		System.out.println("Last character is : "+myString.charAt(3));
		System.out.println("1st and last characters : "+myString.charAt(0)+" "+myString.charAt(myString.length()-1));
		System.out.println(myString.replace("i", "*"));
		System.out.println(myString.toUpperCase());
		System.out.println("The character 'c' first occurs in position "+ (myString.indexOf("c")+1));
	}

}
