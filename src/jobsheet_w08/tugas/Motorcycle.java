package jobsheet_w08.tugas;

public class Motorcycle extends Vehicle {
    private final String typeClutch;
    private final String tankPosition;

    public Motorcycle(String fuel, int wheelCount, int engineCapacity, String typeClutch, String tankPosition) {
        super(fuel, wheelCount, engineCapacity);
        this.typeClutch = typeClutch;
        this.tankPosition = tankPosition;
    }

    public String getTypeClutch() {
        return typeClutch;
    }

    public String getTankPosition() {
        return tankPosition;
    }

    public void startTheEngine() {
        System.out.println("Start the engine");
    }

    @Override
    public void service() {
        System.out.println("recovery ");
    }
}
