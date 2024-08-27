/**
 * 
 */
package reviseWrappers;

/**
 * 
 */
public class Wrappers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intWrapper = 40; //autoboxing
		intWrapper = Integer.valueOf(40);
		
		int primInt = intWrapper.intValue();
		primInt = intWrapper; //auto unboxing
		
		System.out.println(intWrapper);
		
		double doublePrim= intWrapper.doubleValue();
		Double wrapperDouble = intWrapper.doubleValue();
		
		String intString= intWrapper.toString();
		System.out.println(intString);
		
		int intFromParse= Integer.parseInt("66");
		System.out.println(intFromParse);
		
	}

}
