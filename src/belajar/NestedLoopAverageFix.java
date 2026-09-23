package belajar;

public class NestedLoopAverageFix {
    public static void main(String[] args) {
        for (int siswa = 1; siswa <= 3; siswa++) {
            int totalNilai = 0;

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
