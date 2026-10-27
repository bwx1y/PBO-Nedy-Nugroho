package jobsheet_w07;

import jobsheet_w08.tugas.Car;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen2 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");
        System.out.println(dosen2.getAllInfo());

        Car mobil = new Car("tesing", 0, 0, 0, 0);

//      mobil.service();
    }
}