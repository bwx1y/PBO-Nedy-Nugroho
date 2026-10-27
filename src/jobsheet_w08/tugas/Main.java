package jobsheet_w08.tugas;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bensin", 4, 1500, 4, 5);
        System.out.println("--- Car ---");
        car.turnOnAc();
        car.turnOnAc(22);
        car.service();

        System.out.println("\n--- Motorcycle ---");
        Motorcycle motor = new Motorcycle("Bensin", 2, 150, "Manual", "Depan");
        motor.startTheEngine();
        motor.service();
    }
}
