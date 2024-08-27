/**
 * 
 */
package reviseEnums;

/**
 * 
 */
public class BookClub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Books b1= new Books("Catch 22", BookGenre.COMEDY);
		Books b2 = new Books("Peter Kay", BookGenre.COMEDY);
		
		Books[]books= {b1,b2};
		
		for(Books book: books) {
			if(book.getGenre()==BookGenre.COMEDY) {
				System.out.println(book.getName());
			}
		}
	}

}
