package jobsheet_w07;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Object dari class Dosen dibuat");
    }

    @Override
    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}