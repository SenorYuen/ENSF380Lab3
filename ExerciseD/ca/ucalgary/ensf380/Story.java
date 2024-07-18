package ExerciseD.ca.ucalgary.ensf380;
public class Story {
    private Author[] theAuthors; 

    public String plot() {
        return "Method Plot called from Story";
    }
    public Author[] getTheAuthor() {
        return this.theAuthors;
    }
    public void setTheAuthor(Author[] authors) {
        this.theAuthors = authors;
    }
}