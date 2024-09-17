public class Car {
    // Поля класса
    private String model;          // Модель автомобиля
    private String license;        // Номер автомобиля
    private String color;          // Цвет автомобиля
    private int year;              // Год выпуска

    // Конструктор с параметрами (включает все поля класса)
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор по умолчанию
    public Car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    // Конструктор с выбором полей
    public Car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Unknown";
        this.year = 0;
    }

    // Геттеры и сеттеры для полей
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод для вычисления возраста автомобиля
    public int getCarAge() {
        final int CURRENT_YEAR = 2024; // Предполагаемый текущий год
        return CURRENT_YEAR - year;
    }

    // Метод toString для вывода информации об автомобиле
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}