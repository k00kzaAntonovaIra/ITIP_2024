// Базовый класс: Транспортное средство
// Дочерние классы: 
// Легковой автомобиль, 
// Грузовой автомобиль
// Мотоцикл
public class laba2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck("Toyota", "086y", 2010, 30.5);
        Motorcycle motorcycle = new Motorcycle();
        SportMotorcycle sportmotorcycle = new SportMotorcycle();
        car.drive();
        truck.startDrive();
        motorcycle.drive();
        System.out.println(Transport.Count());
        truck.loadCargo(40);
        System.out.println(sportmotorcycle.getRace());

    }
}
