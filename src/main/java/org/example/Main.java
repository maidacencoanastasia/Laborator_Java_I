package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maidacenco Anastasia 15.02.2023!");
        // Create a new Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 218, "Scribner") {
            @Override
            public double getPrice() {
                return 20;
            }
        };

        // Use the methods of the Book object
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of pages: " + book.getNumPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: $" + book.getPrice());

        // Create a new FictionBook object
        FictionBook fbook = new FictionBook("451° Fahrenheit", "Ray Bradbury", 518, "Scribner", "American fiction");

        // Use the methods of the FictionBook object
        System.out.println("Title: " + fbook.getTitle());
        System.out.println("Author: " + fbook.getAuthor());
        System.out.println("Number of pages: " + fbook.getNumPages());
        System.out.println("Publisher: " + fbook.getPublisher());
        System.out.println("Price: $" + fbook.getPrice());
        System.out.println("Genre: " + fbook.getGenre());
        fbook.open();
    }
}
