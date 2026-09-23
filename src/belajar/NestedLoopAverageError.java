package belajar;

public class NestedLoopAverageError {
    public static void main(String[] args) {
        int totalNilai = 0;

        for (int siswa = 1; siswa <= 3; siswa++) {

            for (int ujian = 1; ujian <= 2; ujian++) {
                if (ujian == 1) {
                    totalNilai += 80;
                } else {
                    totalNilai += 90;
                }
            }

            double rataRata = totalNilai / 2.0;
            System.out.println("Siswa ke-" + siswa + " | Total: " + totalNilai + " | Rata-rata: " + rataRata);
        }
    }
}
