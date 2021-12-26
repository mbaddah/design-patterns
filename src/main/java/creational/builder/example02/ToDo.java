package creational.builder.example02;

public class ToDo {
    private final long id;
    private String title = "";
    private String description = "";
    private boolean done = false;


    public ToDo(long id) {
        this.id = id;
    }

    public ToDo(long id, String title, String description, boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = isDone;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }


}
