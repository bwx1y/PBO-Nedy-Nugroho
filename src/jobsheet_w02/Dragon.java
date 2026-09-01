package jobsheet_w02;

import java.time.temporal.ValueRange;

public class Dragon {
    private int x;
    private int y;
    private int direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeDirection(int value) {
        ValueRange range = ValueRange.of(1, 4);
        boolean valid = range.isValidValue(value);

        if (value >= 1 && value <= 4) {
            this.direction = value;
        } else {
            System.out.println("Arah tidak valid! Harus 1-4.");
        }
    }

    public void move(int steps) {
        switch (this.direction) {
            case 1:
                this.y += steps;
                break;
            case 2:
                this.x += steps;
                break;
            case 3:
                this.y -= steps;
                break;
            case 4:
                this.x -= steps;
                break;
            default:
                System.out.println("Tidak di temukan");
        }
    }

    public void printStatus() {
        System.out.printf("Posisi (x,y): (%d, %d) %n", this.x, this.y);

        System.out.println("Arah: " + switch (this.direction) {
            case 1 -> "Atas";
            case 2 -> "Kanan";
            case 3 -> "Bawah";
            case 4 -> "Kiri";
            default -> "Tidak di temukan";
        });

        System.out.println("=".repeat(100));
    }
}
