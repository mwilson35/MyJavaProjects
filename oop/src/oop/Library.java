
package oop;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        Book b1 = new Book("Catch 22", "Joseph Heller", 450, "Humour");
        System.out.println(b1);

        Book b2 = new Book("Laugh Out", "Peter Kay", 301, "Funny");
        System.out.println(b2);

        Book b3 = new Book("Carrie", "Stephen King", 321, "Horror");
        System.out.println(b3);

        Book b4 = new Book("Gravity's Rainbow", "Thomas Pynchon", 721, "Postmodern");
        System.out.println(b4);

        System.out.println();

        ArrayList<Book> myBooks = new ArrayList<Book>();
        myBooks.add(b1);
        myBooks.add(b2);
        myBooks.add(b3);
        myBooks.add(b4);

        System.out.println(myBooks.toString());
        System.out.println("Number of books: " + myBooks.size());

        System.out.println();

        showAllBooks(myBooks);

        System.out.println();

        ArrayList<Book> matchedAuthors = authorSearch(myBooks, "THOMAS PYNCHON");
        System.out.println(matchedAuthors.toString());

        System.out.println();

        ArrayList<Book> matchedGenres = genreSearch(myBooks, "Humour");
        System.out.println(matchedGenres.toString());
    }

    public static void showAllBooks(ArrayList<Book> library) {
        for (Book book : library) {
            System.out.println(book);
        }
    }

    public static ArrayList<Book> authorSearch(ArrayList<Book> library, String author) {
        ArrayList<Book> matched = new ArrayList<Book>();
        System.out.println(author + " books...");
        System.out.println();
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matched.add(book);
            }
        }
        return matched;
    }

    public static ArrayList<Book> genreSearch(ArrayList<Book> library, String genre) {
        ArrayList<Book> matched = new ArrayList<Book>();
        System.out.println(genre + " books...");
        System.out.println();
        for (Book book : library) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                matched.add(book);
            }
        }
        return matched;
    }
}