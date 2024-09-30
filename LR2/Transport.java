public abstract class Transport {
    private String brand;    // Производитель
    private String model;   // Модель
    private int year;       // Год выпуска
    static int count;

    public Transport(){
        this("Unknown", "Unknown", 2000);
        count++;
    }

    public Transport(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        count++;
    }

    // Абстрактный метод 

    public abstract void startDrive();

    // Геттеры и сеттеры

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive(){
        System.out.println("It can drive");
    } 
    public static int Count(){
        return count;
    }
}
