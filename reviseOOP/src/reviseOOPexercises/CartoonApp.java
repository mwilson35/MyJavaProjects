/**
 * 
 */
package reviseOOPexercises;

/**
 * 
 */
public class CartoonApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//test Bart
		SimpsonsCharacter bart = new SimpsonsCharacter();
		bart.setName("Bart");
		bart.setCatchPhrase("Eat my shorts!");
		
		System.out.println(bart.getName());
		System.out.println(bart.getCatchPhrase());
		
		bart.sayCatchPhrase();
		
		SimpsonsCharacter homer= new SimpsonsCharacter();
		homer.setName("Homer");
		homer.setCatchPhrase("D'oh!");
		
		homer.sayCatchPhrase();
	}

}
