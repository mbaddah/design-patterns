package behavioral.strategy;

public class Context {

    RouteStrategy myRouteStrategy;


    public Context() {

    }


    public void setStrategy(RouteStrategy myRouteStrategy) {
        this.myRouteStrategy = myRouteStrategy;
        myRouteStrategy.execute();
    }

    public void doSomething() {
        System.out.println("Navigate from A to B");
    }
}
