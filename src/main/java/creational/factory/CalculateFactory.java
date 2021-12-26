package creational.factory;

public class CalculateFactory {

    public Calculate getCalculation(String type) {
        try {
            Calculate obj = null;
            if (type.equalsIgnoreCase("add")) {
                obj = new Add();
            } else if(type.equalsIgnoreCase("subtract")) {
                obj = new Subtract();
            } else if(type.equalsIgnoreCase("multiply" )) {
                obj = new Multiply();
            } else if(type.equalsIgnoreCase("divide")) {
                obj = new Divide();
            } else {
                System.out.println("not a valid calculation");
            }
            return obj;

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception thrown");
            return null;
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            return null;

        }
   }
}
