package ExerciseD.ca.ucalgary.ensf380;

public class Novel extends Fiction {

    private Author[] theAuthors;
    private Series[] mySeries;

    public String theme() {
        return "Method theme called from Novel";
    }

    public Author[] getTheAuthors() {
        return this.theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public Series[] getMySeries() {
        return this.mySeries;
    }

    public void setMySeries(Series[] mySeries) {
        this.mySeries = mySeries;
    }
}
