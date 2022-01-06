package structural.adapter.eg01;

public class SpeedometerAdapterImpl implements SpeedometerAdapter {

    private final Speedometer speedometer;

    public SpeedometerAdapterImpl(Speedometer speedometer) {
        this.speedometer = speedometer;
    }

    @Override
    public double getTopSpeed() {
        return convertMPHtoKMPH(speedometer.getTopSpeed());
    }

    private double convertMPHtoKMPH(double mph) {

        return mph * 1.60934;
    }
}
