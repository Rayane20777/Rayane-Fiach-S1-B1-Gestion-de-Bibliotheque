package metier;
import java.time.LocalDate;

public abstract class Document {
    private int id;
    private String title;
    private String author;
    private LocalDate publicationDate;
    private int numberOfPages;
    private boolean status;

    Document(int id, String title, String author, LocalDate publicationDate, int numberOfPages, boolean status){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public LocalDate getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate){
        this.publicationDate = publicationDate;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }



    public abstract void borrow();
    public abstract void returnDocument();
    public abstract void displayDetails();



}
