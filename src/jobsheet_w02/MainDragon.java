package jobsheet_w02;

public class MainDragon {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(0, 0,1);
        Dragon dragon2 = new Dragon(0, 0, 1);

        System.out.println("=== DRAGON 1 ===");
        dragon1.move(5);
        dragon1.printStatus();

        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\n=== DRAGON 2 ===");
        dragon2.printStatus();

        dragon2.changeDirection(4);
        dragon2.move(2);

        dragon2.changeDirection(3);
        dragon2.move(4);
        dragon2.printStatus();
    }
}
