package belajar;

public class NestedLoopFor {
    public static void main(String[] args) {
        int column = 5;
        int baris = 5;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("[ %d, %d ]", i, j);
            }

            System.out.println();
        }
    }
}
