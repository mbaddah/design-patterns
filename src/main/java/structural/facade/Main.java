package structural.facade;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //To start and stop the engine user has to just call startEngine() and stopEngine();
        car.startEngine();
        car.stopEngine();
    }
}
