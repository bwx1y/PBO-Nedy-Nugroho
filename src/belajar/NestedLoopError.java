package belajar;

public class NestedLoopError {
    public static void main(String[] args) {
        int baris = 5;

        for (int i = 0; i < baris; i++) {

            for (int j = 0; j < (baris - 1 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // gimana cara nya agar bintang menjadi huruf abc tanpa menggunakan array
        //     a
        //    b c
        //   d e f
        //  g h i j
        // k l m n o
    }
}
