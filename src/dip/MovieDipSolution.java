package dip;

interface Category {}

class DramaCategorySolution implements Category{

}

public class MovieDipSolution {

    private String name;
    private Category category;

    public MovieDipSolution(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
