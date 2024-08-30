package metier;
import java.time.LocalDate;

public class Book extends Document{
    private String isbn;
    public Book (int id, String title, String author, LocalDate publicationDate, int numberOfPages, boolean status, String isbn) {
        super(id, title, author, publicationDate, numberOfPages, status);
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void borrow(){

    }
    public void returnDocument(){

    }
    public void displayDetails(){
        System.out.println("Livre: " + getTitle() + ", Auteur: " + getAuthor() + ", ISBN: " + isbn);
    }

}

