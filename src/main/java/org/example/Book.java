package org.example;

public class Book {
    private String title;
    private String author;
    private int numPages;
    private String publisher;
    public static final double TAX_RATE = 0.5;

    // Constructor
    public Book(String title, String author, int numPages, String publisher) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.publisher = publisher;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getPublisher() {
        return publisher;
    }
}
