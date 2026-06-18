package io.inheritance;

import java.util.Objects;

public class Car extends Vehicle {
    private final int seatsNumber;

    public Car(float fuelEfficiency, VehicleAgregation vehicleAgregation, int seatsNumber) {
        super(fuelEfficiency, vehicleAgregation);
        this.seatsNumber = seatsNumber;
    }

    @Override
    public float calculateFuelEfficiency() {
        return getFuelEfficiency() * (1f / (1f + ( seatsNumber /5f)));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public float calculateMaximumSpeed() {
        return 120f;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;
        return seatsNumber == car.seatsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatsNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "seatsNumber=" + seatsNumber +
                '}';
    }
}
