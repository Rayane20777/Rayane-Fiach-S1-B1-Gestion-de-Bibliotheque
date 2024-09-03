package metier;
import java.util.Scanner;

public class Book extends Document{
    private String isbn;

    public Book (int id, String title, String author, String publicationDate, int numberOfPages, boolean status, String isbn) {
        super(id, title, author, publicationDate, numberOfPages, status);
        this.isbn = isbn;
    }
    public Book () {
        super(0,"","","",0,true);
        this.isbn = "";
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void add(Scanner scanner){
        System.out.print("Enter title: ");
        this.setTitle(scanner.nextLine());
        System.out.print("Enter author: ");
        this.setAuthor(scanner.nextLine());
        System.out.print("Enter publication date: ");
        this.setPublicationDate(scanner.nextLine());
        System.out.print("Enter number of pages: ");
        this.setNumberOfPages(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter status: ");
        this.setStatus(Boolean.parseBoolean(scanner.nextLine()));
        System.out.print("Enter isbn: ");
        this.setIsbn(scanner.nextLine());


    }

    public void borrow(){
        if(getStatus()){
            setStatus(false);
            System.out.println("You have Borrowed" + getTitle());
        }else{
            System.out.println(getTitle() + "is Borrowed!");        }
    }
    public void returnDocument(){
        if(!getStatus()){
            setStatus(false);
            System.out.println("You have Returned" + getTitle());
        }else{
            System.out.println(getTitle() + "is already Available!");
        }

    }
    public void displayDetails(){
            System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublication Date: " + getPublicationDate() + "\nISBN: " + getIsbn() + "\nStatus: " + getStatus());
    }

}

