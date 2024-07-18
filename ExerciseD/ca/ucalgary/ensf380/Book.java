package ExerciseD.ca.ucalgary.ensf380;

public class Book {

    private String isbn;
    private int publicationYear;
    private int pages;

    public Book() {
        this.isbn = "";
        this.publicationYear = 0;
        this.pages = 0;
    }
    
    public Book(String isbn, int publicationYear, int pages) {
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }   

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
