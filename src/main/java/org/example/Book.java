package org.example;

public abstract class Book {
    public static final double TAX_RATE = 0.5;
    private final String title;
    private final String author;
    private final int numPages;
    private final String publisher;

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

    public abstract double getPrice();
}
