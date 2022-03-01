package dip;

class DramaCategory2 {

}

public class MovieDipProblem2 {

    private String name;
    private DramaCategory category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * We always instantiate a DramaCategory2
     * @return
     */
    public DramaCategory2 getCategory() {
        return new DramaCategory2();
    }

    public void setCategory(DramaCategory category) {
        this.category = category;
    }
}


