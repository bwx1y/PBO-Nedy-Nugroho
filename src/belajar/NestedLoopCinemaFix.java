package belajar;

public class NestedLoopCinemaFix {
    public static void main(String[] args) {
        int line = 5;
        int numberSeats = 5;

        // kerena satu deret kursi ke 3 rusak coba hapus jangan di tampilkan

        System.out.println("--- CETAK KURSI BIOSKOP ---");

        for (int i = 0; i < line; i++) {
            char lineChar = (char) ('A' + i);
            System.out.print("Baris " + lineChar + ": ");

            for (int kursi = 1; kursi <= numberSeats; kursi++) {
                char seatsChar = (char) ('A' + (kursi - 1));

                if (kursi == 3) {
                    continue;
                }

                System.out.print("[" + seatsChar + kursi + "] ");
            }

            System.out.println();
        }
    }
}
