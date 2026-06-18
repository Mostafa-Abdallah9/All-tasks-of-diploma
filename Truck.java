package io.inheritance;

import java.util.Objects;

public class Truck extends Vehicle{
    private final float cargoCapacity;

    public Truck(float fuelEfficiency, VehicleAgregation vehicleAgregation, float cargoCapacity) {
        super(fuelEfficiency, vehicleAgregation);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public float calculateFuelEfficiency() {
      return getFuelEfficiency() * (1f / 1f + (cargoCapacity / 1000f));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public float calculateMaximumSpeed() {
        return 80;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Truck truck)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(cargoCapacity, truck.cargoCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                '}';
    }
}
