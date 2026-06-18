package io.inheritance;

import java.util.Objects;

public class MotorCycle extends Vehicle {
    private final float engineDisplacement;

    public MotorCycle(float fuelEfficiency, VehicleAgregation vehicleAgregation, float engineDisplacement) {
        super(fuelEfficiency, vehicleAgregation);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public float calculateFuelEfficiency() {
        return getFuelEfficiency() * (1f/(1f+(engineDisplacement / 1000f)));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public float calculateMaximumSpeed() {
        return 90f;
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MotorCycle that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(engineDisplacement, that.engineDisplacement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineDisplacement);
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "engineDisplacement=" + engineDisplacement +
                '}';
    }
}
