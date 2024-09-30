public class Motorcycle extends Transport {
    private boolean hasSidecar; // Наличие коляски
    private int maxSpeed; // Максимальная скорость

    // Конструктор по умолчанию
    public Motorcycle(){
        this("Unknown", "Unknown", 2000, false, 100);
    } 

    // Конструктор с параметрами

    public Motorcycle(String make, String model, int year, boolean hasSidecar, int maxSpeed) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startDrive(){
        System.out.println("МОтоцикл стартанул");
    }

    // Геттеры и сеттеры

    public boolean getSidecar(){
        return hasSidecar;
    }

    public void setSidecar(boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }

    public int getSpeed(){
        return maxSpeed;
    }

    public void setSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    
    public void attachSidecar() {
        if (!hasSidecar) {
            hasSidecar = true;
            System.out.println("Коляска установлена.");
        } else {
            System.out.println("Коляска уже установлена.");
        }
    }
}
