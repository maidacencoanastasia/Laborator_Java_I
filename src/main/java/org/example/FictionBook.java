package org.example;

public class FictionBook extends Book implements Readable {
    private final String genre;

    // Constructor
    public FictionBook(String title, String author, int numPages, String publisher, String genre) {
        super(title, author, numPages, publisher);
        this.genre = genre;
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

    public double getPrice() {
        return getNumPages() * 0.02; // prețul este de 2 bani pe pagină
    }

    public String getGenre() {
        return genre;
    }
}
