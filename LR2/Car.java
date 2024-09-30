public class Car extends Transport{
    private int doors; // Количество дверей

    // Конструктор по умолчанию
    public Car() {
        this("Unknown", "Unknown", 2000, 4);
    }

    // Конструктор с параметрами

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }
    
    @Override
    public void startDrive(){
        System.out.println("Легковой автомобиль стартанул");
    }

    // Геттеры и сеттеры

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void openSunroof() {
        System.out.println("Люк открыт.");
    }

    public void enableCruiseControl() {
        System.out.println("Круиз-контроль активирован.");
    }

}   
