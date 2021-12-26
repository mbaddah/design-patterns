package creational.factory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            double x = input.nextDouble();

            System.out.println("Enter a second number");
            double y = input.nextDouble();

            CalculateFactory factory = new CalculateFactory();
            System.out.println("Enter calculation operation");
            Calculate obj = factory.getCalculation(input.next());
            obj.calculate(x,y);


        } catch (InputMismatchException e) {
            e.printStackTrace();
        }



    }
}
