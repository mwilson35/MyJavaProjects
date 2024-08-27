/**
 * 
 */
package challenges;

/**
 * 
 */
public class Books2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AmazonBooks b1= new AmazonBooks("The body: A guide", "Bill Bryson", 7.99, 18.53, 7.99, 0.00, 453, "0857522418", 4.7, "English");
		AmazonBooks b2= new AmazonBooks("Ulysses", "James Joyce", 3.99, 18.39, 0.75, 0.0, 736, "1840226358", 4.4, "English");
		
		AmazonBooks[] amazonBooksAll= {b1,b2};
		for(int loop=0;loop<amazonBooksAll.length;loop++) {
			System.out.println(amazonBooksAll[loop]);
		}
		if(b1.getPages()>b2.getPages()){
			System.out.println("Longest book : "+b1.getTitle());
		}else if(b2.getPages()>b1.getPages()) {
			System.out.println("Longest book is : "+b2.getTitle());
		}else {
			System.out.println("Both are the same length"
					+ "");
		}
	}

}
