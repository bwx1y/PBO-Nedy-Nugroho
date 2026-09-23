package belajar;

public class NestedLoopHourglass {
    public static void main(String[] args) {
        int baris = 10;

        for (int i = 0; i < baris; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (baris - i); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i < baris; i++) {

            for (int j = 0; j < (baris - 1 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
