package metier;

import java.util.Scanner;


public class Magazine extends Document {

private int number;

    public Magazine () {
        super(0,"","","",0,true);
        this.number = 0;
    }

public Magazine (int id, String title, String author, String publicationDate, int numberOfPages, boolean status, int number) {
    super(id, title, author, publicationDate, numberOfPages, status);
    this.number = number;
}
public int getNumber() {
    return number;
}

public void add(Scanner scanner){
    System.out.print("Enter the magazine title: ");
    setTitle(scanner.nextLine());
    System.out.print("Enter the magazine author: ");
    setAuthor(scanner.nextLine());
    System.out.print("Enter the magazine publication date: ");
    setPublicationDate(scanner.nextLine());
    System.out.print("Enter the number of pages: ");
    setNumberOfPages(scanner.nextInt());
    System.out.print("Enter the status of the magazine: ");
    setStatus(scanner.nextBoolean());
    System.out.print("Enter the number of the page: ");
    setNumber(scanner.nextInt());



}

public void setNumber(int number) {
    this.number = number;
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
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublication Date: " + getPublicationDate() + "\nNumber: " + getNumber());
    }



}
