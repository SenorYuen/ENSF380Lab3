package ExerciseD.ca.ucalgary.ensf380;
public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;

    public String sort() {
        return "Method sort called from Category";

    }
    public Category getSubCategory() {
        return this.subCategory;
    }
    public void setSubCategory(Category sub) {
        this.subCategory = sub;
    }
    
    public Category getSuperCategory() {
        return this.superCategory;
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
