package creational.builder.example01;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Ned","Stark")
                .age(30)
                .phone("123456")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder( "Jon","Snow")
                .phone("1111222")
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Sansa","Stark").build();
        System.out.println(user3);

    }
}
