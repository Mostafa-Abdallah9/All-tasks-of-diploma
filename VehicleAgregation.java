package io.inheritance;

import java.util.Objects;

public class VehicleAgregation {
    private final String companyOwner;
    private final String model;
    private final int year;
    private final String fuelType;

    public VehicleAgregation(String companyOwner, String model, int year, String fuelType) {
        this.companyOwner = companyOwner;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VehicleAgregation that)) return false;
        return year == that.year && Objects.equals(companyOwner, that.companyOwner) && Objects.equals(model, that.model) && Objects.equals(fuelType, that.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyOwner, model, year, fuelType);
    }

    @Override
    public String toString() {
        return "VehicleAgregation{" +
                "companyOwner='" + companyOwner + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
