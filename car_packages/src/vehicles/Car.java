package vehicles;

public class Car extends Vehicle {
    public Car(String ownerName, String insuranceNumber, String model, String license, String color, int year, String engineType) {
        super(ownerName, insuranceNumber, model, license, color, year, "Combustion");
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", license='" + getLicense() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                '}';
    }
    public String VehicleType() {
        return "Car";
    }
}
