public class Main {
    public static void main(String[] args) {
        // Создание экземпляров класса Car с использованием различных конструкторов
        Car car1 = new Car("Toyota Camry", "ABC123", "Black", 2020);
        Car car2 = new Car("Honda Civic", "XYZ789", "Red", 2018);
        Car car3 = new Car("BMW X5", "LMN456");  // Конструктор с выбором полей

        // Установка значений для car3
        car3.setColor("White");
        car3.setYear(2021);

        // Вывод информации об автомобилях с использованием метода toString()
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Проверка работы метода getCarAge()
        System.out.println("Возраст автомобиля car1: " + car1.getCarAge() + " года.");
        System.out.println("Возраст автомобиля car2: " + car2.getCarAge() + " года.");
        System.out.println("Возраст автомобиля car3: " + car3.getCarAge() + " года.");
    }
}