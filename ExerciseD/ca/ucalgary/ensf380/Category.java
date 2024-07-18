package ExerciseD.ca.ucalgary.ensf380;
public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;

    public String sort() {
        String returnString = "Method sort called from Category";
        return returnString;
    }
    public Category getSubCategory() {
        return this.subCategory;
    }
    public void setSubCategory(Category sub) {
        this.subCategory = sub;
    }
    public Category getSuperCategory() {
        return this.subCategory;
    }
    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }
    public String getCategory() {
        return this.category;  
    }
    public void setCategroy(String categoryName) {
        this.category = categoryName;
    }
}
