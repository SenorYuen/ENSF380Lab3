package ExerciseD.ca.ucalgary.ensf380;

public class Classic extends Hardcover {

    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public String createNotes() {
        return "Method createNotes called from Classic";
    }

    public int getOrigPubYear() {
        return this.origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getTheAuthor() {
        return this.theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher[] getBookPublisher() {
        return this.bookPublisher;
    }

    public void setBookPublisher(Publisher[] bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
