package metier;

import java.time.LocalDate;

public class Magazine extends Document {

private int number;

public Magazine (int id, String title, String author, LocalDate publicationDate, int numberOfPages, boolean status, int number) {
    super(id, title, author, publicationDate, numberOfPages, status);
    this.number = number;
}
public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
}

public void borrow(){

}
public void returnDocument(){

}
public void displayDetails(){
    System.out.println("Magazine: " + getTitle() + ", Auteur: " + getAuthor() + ", Numéro: " + number);
}



}
