package structural.adapter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import structural.adapter.eg01.*;

class SpeedometerTest {

    @Test
    void givenFordSpeedometerConvertTopSpeedMphToKmph() {
        Speedometer fordSpeedometer = new FordSpeedometer();
        SpeedometerAdapter fordAdapter = new SpeedometerAdapterImpl(fordSpeedometer);
        assertEquals(482.802,fordAdapter.getTopSpeed());
    }

    @Test
    void givenFerrariSpeedometerConvertTopSpeedMphToKmph() {
        Speedometer ferrariSpeedometer = new FerrariSpeedometer();
        SpeedometerAdapter ferrariAdapter = new SpeedometerAdapterImpl(ferrariSpeedometer);
        assertEquals(804.67,ferrariAdapter.getTopSpeed());
    }


}
