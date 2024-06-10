package Oops;

class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}


class Book {
    // Member variables
    private String name;
    private Author author;
    private double price;

    // Parameterized constructor
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to return book details as a string
    public String toString() {
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + "]";
    }
}

public class BookDetails{
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("J.K. Rowling", "jk.rowling@example.com", 'F');

        // Create a Book object
        Book book = new Book("Harry Potter", author, 39.99);

        // Print the book details including author details
        System.out.println(book.toString());
    }
}