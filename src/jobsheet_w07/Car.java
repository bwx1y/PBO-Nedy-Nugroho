package jobsheet_w07;

public class Car extends Vehicle {
    private final int doorCount;
    private final int passengerCount;
    private boolean isActiveAc;

    public Car(String fuel, int wheelCount, int engineCapacity, int doorCount, int passengerCount) {
        super(fuel, wheelCount, engineCapacity);
        this.doorCount = doorCount;
        this.passengerCount = passengerCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void turnOnAc() {
        if (isActiveAc) {
            System.out.println("Ac is already on");
        } else {
            System.out.println("Turn on ac");
        }
    }

    public void turnOnAc(int temperature) {
        this.turnOnAc();
        System.out.printf("Ac set on %d C", temperature);
    }

    public void turnOffAc() {
        if (!isActiveAc) {
            System.out.println("Ac is already off");
        } else {
            System.out.println("Turn off ac");
        }
    }

    @Override
    public void service() {
        super.service();
        System.out.println("recovery ac");
    }
}
