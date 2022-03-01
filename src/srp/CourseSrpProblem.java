package srp;

/**
 * A class that represents the breach of the Single Responsibility Principle.
 */
public class CourseSrpProblem {

    private String name;
    private Category category;
    private String description;

    /**
     * Method to represent connection with DB
     * @return
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Method that create a Category
     * @return
     */
    public Category createCategory() {
        return new Category();
    }

    public CourseSrpProblem() {}

    /*
        Getter and Setters
     */
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Connection {}

class Category {}
