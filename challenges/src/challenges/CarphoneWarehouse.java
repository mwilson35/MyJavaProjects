/**
 * 
 */
package challenges;

/**
 * 
 */
public class CarphoneWarehouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MobilePhone p1= new MobilePhone("Apple iPhone", 11, 4);
		MobilePhone p2=new MobilePhone("Samsung Galaxy", 10, 2);
		
		MobilePhone[]MobilePhoneAll= {p1,p2};
		for(int loop=0;loop<MobilePhoneAll.length;loop++) {
			System.out.println(MobilePhoneAll[loop]);
		}
		
	}

}
