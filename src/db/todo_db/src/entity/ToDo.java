package entity;

public class ToDo {
    
    public int id;
    public String title;
    public String description;
    public boolean done;

    public ToDo(int id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    @Override
    public String toString() {
        return String.format("ID: %d  |Title: %s  |Description: %s  |Done: %s", id, title, description, done);
    }
}
