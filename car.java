public class car {
    // Поля класса
    private String model;          // Модель автомобиля
    private String license;        // Номер автомобиля
    private String color;          // Цвет автомобиля
    private int year;              // Год выпуска

    // Конструктор с параметрами (включает все поля класса)
    public car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор по умолчанию
    public car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    // Конструктор с выбором полей
    public car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Unknown";
        this.year = 0;
    }
}