package creational.singleton;

public class Main {
    public static void main(String[] args) {

        try {
            MySingleton firstInstanceOfMySingleton = MySingleton.getMySingleton();
            MySingleton anotherInstanceOfASingleton = MySingleton.getMySingleton(); //This will fail to instantiate

        } catch (Exception e) {
            System.out.println("Exception thrown - need update with exception handling");
            e.printStackTrace();
        }


    }
}
