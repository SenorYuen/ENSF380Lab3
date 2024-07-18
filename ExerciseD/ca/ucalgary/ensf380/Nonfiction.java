package ExerciseD.ca.ucalgary.ensf380;
public class Nonfiction {
    private Category deweyClassification;

    public String topic() {
        return "Method topic called from Nonfiction";
    }
    public Category getDeweyClassification() {
        return this.deweyClassification;
    }
    public void setDeweyClassification(Category cat) {
        this.deweyClassification = cat;
    }
}
