package dip;

class DramaCategory {

}

public class MovieDipProblem {

    private String name;
    private DramaCategory category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DramaCategory getCategory() {
        return category;
    }

    /**
     * Category will always have to be DramaCategory
     * @param category
     */
    public void setCategory(DramaCategory category) {
        this.category = category;
    }
}
