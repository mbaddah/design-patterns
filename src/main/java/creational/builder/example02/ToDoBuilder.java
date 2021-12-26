package creational.builder.example02;

public class ToDoBuilder {

    private final long id;
    private String title = "";
    private String description = "";
    private boolean done = false;

    public ToDoBuilder(long id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public ToDoBuilder(long id) {
        this.id = id;
    }

    public ToDoBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ToDoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ToDoBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public ToDo build() {
        return new ToDo(id,title,description,done);
    }

}
