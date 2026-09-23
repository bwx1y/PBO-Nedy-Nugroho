package belajar;

public class Tutorial {
    public static void main(String[] args) {
//        for
//        for (int i = 0; i <= 5 ; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i == 0 || i == 5 || j == 0 || j == 5) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        while

//        int i = 0;
//        while (i <= 5) {
//
//            int j = 0;
//
//            while (j <= 5) {
//                System.out.print("[" + i + "," + j + "]");
//
//                j++;
//            }
//
//            i++;
//        }

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
