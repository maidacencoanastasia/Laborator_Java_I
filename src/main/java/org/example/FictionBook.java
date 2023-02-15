package org.example;

public class FictionBook extends Book  implements Readable{
    private String genre;
    private String title;

    // Constructor
    public FictionBook(String title, String author, int numPages, String publisher, String genre) {
        super(title, author, numPages, publisher);
        this.genre = genre;
    }

    // Getters and setters

    public String getGenre() {
        return genre;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // Implementarea metodelor din interfață
    public void open() {
        System.out.println("Opening fiction book: " + getTitle());
    }

    public void close() {
        System.out.println("Closing fiction book: " + getTitle());
    }

    public void turnPage() {
        System.out.println("Turning page of fiction book: " + getTitle());
    }


}
