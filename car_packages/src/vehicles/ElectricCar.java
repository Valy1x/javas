package vehicles;

public class ElectricCar extends Car implements ElectricVehicle{
    private int batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, String model, String license, String color, int year, String engineType) {
        super(ownerName, insuranceNumber, model, license, color, year, "Electric");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "ElectricCar";
    }
}
