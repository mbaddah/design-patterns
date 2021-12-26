package behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        RouteStrategy busRoute = new RouteStrategyBus();
        RouteStrategy trainRoute = new RouteStrategyTrain();
        Context c = new Context();
        c.setStrategy(busRoute);
        c.doSomething();
        c.setStrategy(trainRoute);
        c.doSomething();

    }
}
