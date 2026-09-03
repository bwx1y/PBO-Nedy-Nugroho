package jobsheet_w02;

import java.time.temporal.ValueRange;

public class Dragon {
    private int x;
    private int y;
    private int direction;

    public Dragon() {
        this.x = 0;
        this.y = 0;
        this.direction = 1;
    }

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;

        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            System.out.println("Arah awal (" + direction + ") tidak valid! Default diatur ke 1 (Atas).");
            this.direction = 1;
        }
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
