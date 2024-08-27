/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Whale w1 = new Whale();
		w1.setName("Right");
		w1.setMainOcean("Atlantic");
		w1.setWeight("2001");
		w1.setMaxSpeed("21");
		w1.setLength("16");

		Whale w2 = new Whale();
		w2.setName("Blue");
		w2.setMainOcean("Pacific");
		w2.setWeight("2001");
		w2.setMaxSpeed("23");
		w2.setLength("16");

		Whale w3 = new Whale();
		w3.setName("Sperm");
		w3.setMainOcean("Atlantic");
		w3.setWeight("1900");
		w3.setMaxSpeed("20");
		w3.setLength("16");
		
		Whale w4= new Whale();
		w4.setName("Humpback");
		w4.setMainOcean("Antarctic");
		w4.setWeight("919");
		w4.setMaxSpeed("13");
		w4.setLength("13");
		
		Whale[]whales= {w1,w2,w3,w4};
		for(int loop=0;loop<whales.length;loop++) {
			System.out.println(whales[loop].toString());
			
		}

	}

}
