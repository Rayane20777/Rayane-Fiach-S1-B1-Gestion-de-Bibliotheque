package metier;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Magazine extends Document {

private int number;



public Magazine ( String title, String author, LocalDate publicationDate, int numberOfPages, boolean status, int number) {
    super( title, author, publicationDate, numberOfPages, status);
    this.number = number;
}
    public Magazine () {
        super("","",LocalDate.now(), 0,true);
        this.number = 0;
    }

    public static void search(List<Magazine> magazines, String title){
        boolean found = false;
        title = title.toLowerCase();

        for (Magazine magazine : magazines) {
            if (magazine.getTitle().toLowerCase().equals(title)) {
                if (!found) {
                    System.out.println("Magazine(s) found:");
                }
                magazine.displayDetails();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No magazines found with the title \"" + title + "\".");
        }
    }

public int getNumber() {
    return number;
}

public void setNumber(int number) {
    this.number = number;
}

public void add(Scanner scanner){
    System.out.print("Enter the magazine title: ");
    this.setTitle(scanner.nextLine());
    System.out.print("Enter the magazine author: ");
    this.setAuthor(scanner.nextLine());
    System.out.print("Enter the magazine publication date (yyyy-mm-dd): ");
    this.setPublicationDate(scanner.nextLine());

    System.out.print("Enter the number of pages: ");
    while (!scanner.hasNextInt()) {
        System.out.println(" Invalid input Please enter a valid number: ");
        scanner.nextLine();
    }
    this.setNumberOfPages(scanner.nextInt());
    scanner.nextLine();


    System.out.print("Enter magazine series: ");
    while (!scanner.hasNextInt()) {
        System.out.println(" Invalid input Please enter a valid number: ");
        scanner.nextLine();
    }
    this.setNumber(scanner.nextInt());




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
            setStatus(true);
            System.out.println("You have Returned" + getTitle());
        }else{
            System.out.println(getTitle() + "is already Available!");
        }

    }

    public void displayDetails(){
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublication Date: " + getPublicationDate() + "\nNumber: " + getNumber() + "\nStatus: " + getStatus() + "\nNumber of pages: " + getNumberOfPages());
    }



}
