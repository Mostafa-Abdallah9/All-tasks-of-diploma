package io.inheritance;

import java.util.Objects;

public class Vehicle {
    private final float fuelEfficiency;
    private final VehicleAgregation vehicleAgregation;

    public Vehicle(float fuelEfficiency, VehicleAgregation vehicleAgregation) {
        this.fuelEfficiency = fuelEfficiency;
        this.vehicleAgregation = vehicleAgregation;
    }

    public float calculateFuelEfficiency() {
        return 0;
    }

    public float calculateDistanceTraveled() {
        return 0;
    }

    public float calculateMaximumSpeed() {
      return 0;
    }

    public float getFuelEfficiency() {
        return fuelEfficiency;
    }

    public VehicleAgregation getVehicleAgregation() {
        return vehicleAgregation;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(vehicleAgregation, vehicle.vehicleAgregation);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(vehicleAgregation);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleAgregation=" + vehicleAgregation +
                '}';
    }
}
