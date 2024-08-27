/**
 * 
 */
package reviseExercises;

/**
 * 
 */
public class VowelSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letter;

		letter = 'e';
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		case 'b':
		case'c':
		case'd':
		case'f':
			System.out.println("consonant");
			break;
		}

	}

}
