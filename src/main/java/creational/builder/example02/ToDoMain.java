package creational.builder.example02;

public class ToDoMain {
    public static void main(String[] args) {
        ToDo myTodoSetWithAllFields = new ToDoBuilder(5).setTitle("abc").setDescription("desc").setDone(true).build();
        System.out.println(myTodoSetWithAllFields);

        ToDo myTodoSetWithOnlyID = new ToDoBuilder(1).build();
        System.out.println(myTodoSetWithOnlyID);


    }
}
