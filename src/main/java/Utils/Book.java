package Utils;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String publisher;
    private BookLanguages language;
    private String bookType;


    public Book(String title, String author, int numberOfPages, String publisher, BookLanguages language, String bookType) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.language = language;
        this.bookType = bookType;
    }

    public Map<String, String> toMap() {
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("title", title);
        bookMap.put("author", author);
        bookMap.put("numberOfPages", String.valueOf(numberOfPages));
        bookMap.put("publisher", publisher);
        bookMap.put("language", language.name());
        bookMap.put("bookType", bookType);

        return bookMap;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookLanguages getLanguage() {
        return language;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}