package rev;

import java.util.ArrayList;

public class Book {

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Book b1 = new Book("Catch 22", "Joseph Heller", 450, "Funny");
		Book b2 = new Book("Funny times", "Peter Kay", 301, "Humour");
		Book b3 = new Book("Jurrassic Park", "Michael Critchton", 600, "Sci-fi");

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		System.out.println("Number of books: " + books.size());
		showAllBook(books);

	}

	private static void showAllBook(ArrayList<Book> books) {
		
	}

}
