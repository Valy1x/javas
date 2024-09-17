public class Main{
    public static void main(String[] args) {
        // Создание объектов класса Car с использованием разных конструкторов
        car car1 = new car("Toyota Camry", "XYZ-1234", "Black", 2020);
        car car2 = new car(); // Конструктор по умолчанию
        car car3 = new car("Honda Accord", "ABC-5678"); // Конструктор с выбором полей

        // Вывод информации об автомобилях
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}