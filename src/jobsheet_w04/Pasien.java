package jobsheet_w04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedias;
    private String nama;
    private final ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedias = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList();
    }

    public String getNoRekamMedis() {
        return noRekamMedias;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedias = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("No Rekam Medis : ").append(this.noRekamMedias).append("\n");
        info.append("Nama           : ").append(this.nama).append("\n");

        if (!riwayatKonsultasi.isEmpty()) {
            info.append("Riwayat Konsultasi : \n");
            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info.append(konsultasi.getInfo());
            }
        } else {
            info.append("Belum ada riwayat konsultasi\n");
        }

        return info.toString();
    }
}
