public class Truck extends Transport {
    private double loadCapacity; // Грузоподъемность

    // Конструктор по умолчанию
    public Truck(){
        this("Unknown", "Unknown", 2000, 20.0);
    }

    // Конструктор с параметрами

    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startDrive(){
        System.out.println("Грузовой автомобиль стартанул");
    }

    // Геттеры и сеттеры

    public double getLoat(){
        return loadCapacity;
    }

    public void setLoat(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public void loadCargo(double weight) {
        if (weight <= loadCapacity) {
            System.out.println("Груз " + weight + " кг загружен.");
        } else {
            System.out.println("Слишком большой вес! Грузоподъемность: " + loadCapacity + " кг.");
        }
    }
}
