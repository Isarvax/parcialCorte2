package Problema2;

public class Product {

    private static int counter=1;

    private int id ;
    private String name;
    private String description;
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' + "id= "+id+
                ", description='" + description + '\'' +
                ", state=" + state ;
    }

    public Product(String name, String description, State state) {
        this.id=counter;
        counter++;
        this.name = name;
        this.description = description;
        this.state = state;
    }
}
