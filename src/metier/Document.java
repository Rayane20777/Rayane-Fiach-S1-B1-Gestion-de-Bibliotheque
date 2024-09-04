package metier;
import utilitaire.DateUtils;
import java.time.LocalDate;

public abstract class Document {
    private String title;
    private String author;
    private LocalDate publicationDate;
    private int numberOfPages;
    private boolean status;

    Document( String title, String author, LocalDate publicationDate, int numberOfPages, boolean status){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.status = status;
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
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
    public void setPublicationDate(String publicationDateStr) {
        this.publicationDate = DateUtils.parseDate(publicationDateStr);
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



    abstract void borrow();
    abstract void returnDocument();
    abstract void displayDetails();


}
