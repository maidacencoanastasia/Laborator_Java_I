package org.example;

public class FictionBook extends Book{
    private String genre;

    // Constructor
    public FictionBook(String title, String author, int numPages, String publisher, String genre) {
        super(title, author, numPages, publisher);
        this.genre = genre;
    }

    // Getters and setters
    // ...

}
