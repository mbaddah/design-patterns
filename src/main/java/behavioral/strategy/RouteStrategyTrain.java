package behavioral.strategy;

public class RouteStrategyTrain implements RouteStrategy {
    @Override
    public void execute() {
        System.out.println("train route");
    }
}
