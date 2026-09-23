package belajar;

public class NestedLoopWhile {
    public static void main(String[] args) {
        int column = 5;
        int baris = 5;

        int i = 0;
        while (i <= baris) {
            int j = 0;

            while (j <= column) {
                System.out.printf("[ %d, %d ]", i, j);
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
