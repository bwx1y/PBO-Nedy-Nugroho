package jobsheet_w03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double nominal) {
        if ((jumlahPinjaman + nominal) > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(double nominal) {
        double batasMinimal = jumlahPinjaman * 0.10;
        if (nominal < batasMinimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}