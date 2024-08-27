/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class CartoonApp {

	/**
	 * @param 
	 */
	public static void main(String[] args) {
		
		SimpsonsChar bart= new SimpsonsChar();
		bart.setName("Bart");
		bart.setCatchphrase("Eat my shorts");
		System.out.println("Name "+" Catchphrase");
		System.out.println(bart.getName()+"  "+bart.getCatchphrase());
		
		SimpsonsChar homer= new SimpsonsChar();
		homer.setName("Homer");
		homer.setCatchphrase("D'oh");
		
		System.out.println(homer.getName()+" "+homer.getCatchphrase());
	}

}
