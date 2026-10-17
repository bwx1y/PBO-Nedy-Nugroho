package jobsheet_w07;

public class Vehicle {
    private final String fuel;
    private final int wheelCount;
    private final int engineCapacity;

    public Vehicle(String fuel, int wheelCount, int engineCapacity) {
        this.fuel = fuel;
        this.wheelCount = wheelCount;
        this.engineCapacity = engineCapacity;
    }

    public String getFuel() {
        return fuel;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void service() {
        System.out.println("Engine recovery");
    }
}
