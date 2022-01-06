package structural.adapter.eg01;

public class FerrariSpeedometer implements Speedometer {
    @Override
    public double getTopSpeed() {
        return 500;
    }
}
