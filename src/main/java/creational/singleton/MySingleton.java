package creational.singleton;

public class MySingleton {

    private static MySingleton mySingleton;
    private static boolean isMySingleInstantiated = false;

    //Constructors are private in a singleton
    private MySingleton() {

    }

    // Checks first if a singleton has been instantiated
    public static synchronized MySingleton getMySingleton() {
        if(mySingleton == null) {
            mySingleton = new MySingleton();
            isMySingleInstantiated = true;
            System.out.println("New instance has been instantiated");
        } else {
            System.out.println("An instance of MySingleton has already been instantiated");
        }
        return mySingleton;
    }

    public static boolean isIsMySingleInstantiated() {
        return isMySingleInstantiated;
    }
}
