package ExerciseD.ca.ucalgary.ensf380;
public class Anthology {
    private Story[] stories;

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return this.stories;
    }
    
    public void setStory(Story[] stories) {
        this.stories = stories;
    }
}
