
package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car regularCar = new Car("Buga", "123456789", "Miata", "10", "blue", 1990, "V8");
        ElectricCar tesla = new ElectricCar("Baga", "14141414", "XYZ", "100011", "Red", 2023, "popl");
        System.out.println(regularCar);
        System.out.println(tesla);
        System.out.println(tesla.getBatteryCapacity());
        System.out.println(regularCar.vehicleType());
        System.out.println(tesla.vehicleType());
    }
}
