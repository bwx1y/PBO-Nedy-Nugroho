package belajar;

public class NestedLoopCircleCube {
    public static void main(String[] args) {
        int column = 5;
        int baris = 5;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0 || i == (baris - 1) || j == (column - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
