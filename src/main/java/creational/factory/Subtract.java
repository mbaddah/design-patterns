package creational.factory;

public class Subtract implements Calculate {
    @Override
    public void calculate(double x, double y) {
        try{
        System.out.println("x - y = " + (x-y));
    } catch (ArithmeticException e) {
        e.printStackTrace();
    }
    }
}
