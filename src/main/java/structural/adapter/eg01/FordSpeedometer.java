package structural.adapter.eg01;

public class FordSpeedometer implements Speedometer {
    @Override
    public double getTopSpeed() {
        return 300;
    }
}
