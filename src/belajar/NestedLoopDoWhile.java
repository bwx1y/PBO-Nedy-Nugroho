package belajar;

public class NestedLoopDoWhile {
    public static void main(String[] args) {
        int column = 5;
        int baris = 5;

        int i = 0;
        do {
            int j = 0;

            do {
                System.out.printf("[ %d, %d ]", i, j);
                j++;
            } while (j <= column);

            System.out.println();
            i++;
        } while (i <= baris);
    }
}
