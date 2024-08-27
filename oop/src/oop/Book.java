package oop;

public class Book {
    private int pageNum;
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, int pageNum, String genre) {
        this.title = title;
        this.author = author;
        this.pageNum = pageNum;
        this.genre = genre;
    }

    public int getPageNum() {
        return pageNum;
    }

    @Override
    public String toString() {
        return "Book [pageNum=" + pageNum + ", title=" + title + ", author=" + author + ", genre=" + genre + "]";
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
