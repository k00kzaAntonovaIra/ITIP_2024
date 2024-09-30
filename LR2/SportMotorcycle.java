public class SportMotorcycle extends Motorcycle {
    private int horsepower;
    private String racingNumber;

    // Конструктор по умолчанию
    public SportMotorcycle(){
        this("Unknown", "Unknown", 2000, false, 100, 200, "0");
    }

    // Конструктор с параметрами
    public SportMotorcycle(String brand, String model, int year, boolean hasSidecar, int maxSpeed, int horsepower, String racingNumber) {
        super(brand, model, year, hasSidecar, maxSpeed);
        this.horsepower = horsepower;
        this.racingNumber = racingNumber;
    }

    @Override
    public void startDrive(){
        System.out.println("Спортмотоцикл стартанул");
    }

    // Геттеры и сеттеры

    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

    public int getHorsepower(){
        return horsepower;
    }

    public void setRace(String racingNumber){
        this.racingNumber = racingNumber;
    }

    public String getRace(){
        return racingNumber;
    }


}