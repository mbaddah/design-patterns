package structural.facade;

public class Car {

    //This is a highly simplified model of starting a car engine. Realistically there are many components to an engine such as fuel injectors, cooling, airflow etc...
    Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startEngine() {

        engine.someAction01();
        engine.someAction02();
        engine.someAction03();
        engine.someAction04();
        engine.someAction05();
    }
    public void stopEngine() {
        engine.someAction06();
        engine.someAction07();
        engine.someAction08();
        engine.someAction09();
        engine.someAction10();

    }
}
