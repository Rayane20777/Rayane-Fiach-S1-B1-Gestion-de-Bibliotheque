package metier;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Book extends Document {

    private String isbn;

    public Book(String title, String author, LocalDate publicationDate, int numberOfPages, boolean status, String isbn) {
        super(title, author, publicationDate, numberOfPages, status);
        this.isbn = isbn;
    }

    public Book() {
        super("", "", LocalDate.now(), 0, true);
        this.isbn = "";
    }

    public static void search(List<Book> books, String title) {
        boolean found = false;
        title = title.toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().equals(title)) {
                if (!found) {
                    System.out.println("Book(s) found:");
                }
                book.displayDetails();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title \"" + title + "\".");
        }

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void add(Scanner scanner) {
        System.out.print("Enter title: ");
        this.setTitle(scanner.nextLine());
        System.out.print("Enter author: ");
        this.setAuthor(scanner.nextLine());
        System.out.print("Enter publication date (dd/MM/yyyy): ");
        this.setPublicationDate(scanner.nextLine());
        System.out.print("Enter the number of pages: ");
        while (!scanner.hasNextInt()) {
            System.out.println(" Invalid input Please enter a valid number: ");
            scanner.nextLine();
        }

        this.setNumberOfPages(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter isbn: ");
        this.setIsbn(scanner.nextLine());

    }

    public void borrow() {
        if (getStatus()) {
            setStatus(false);
            System.out.println("You have Borrowed" + getTitle());
        } else {
            System.out.println(getTitle() + "is Borrowed!");
        }
    }

    public void returnDocument() {
        if (!getStatus()) {
            setStatus(true);
            System.out.println("You have Returned" + getTitle());
        } else {
            System.out.println(getTitle() + "is already Available!");
        }

    }

    public void displayDetails() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublication Date: " + getPublicationDate() + "\nISBN: " + getIsbn() + "\nStatus: " + getStatus());
    }
}
