package behavioral.strategy;

public class RouteStrategyBus implements RouteStrategy {

    @Override
    public void execute() {
        System.out.println("bus route");
    }
}
