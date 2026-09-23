public class PesertaSertifikasiDemo {
    public static void main(String[] args) {
        PesertaSertifikasi peserta1 = new PesertaSertifikasi("P001", "Andi");
        PesertaSertifikasi peserta2 = new PesertaSertifikasi("P002", "Budi");
        PesertaSertifikasi peserta3 = new PesertaSertifikasi("P003", "Citra");

        // Memberikan nilai peserta 1
        peserta1.setNilaiPraktik(80);
        peserta1.setNilaiTeori(75);
        peserta1.setNilaiProyek(85);

        // Memberikan nilai peserta 2
        peserta2.setNilaiPraktik(70);
        peserta2.setNilaiTeori(60);
        peserta2.setNilaiProyek(60);

        // Memberikan nilai peserta 3
        peserta3.setNilaiPraktik(50);
        peserta3.setNilaiTeori(90);
        peserta3.setNilaiProyek(90);

        // Pengujian nilai tidak valid
        System.out.println("=== PENGUJIAN NILAI TIDAK VALID ===");
        peserta1.setNilaiPraktik(110);

        // Menampilkan data peserta
        System.out.println("\n=== DATA PESERTA 1 ===");
        peserta1.tampilkanInfo();

        System.out.println("=== DATA PESERTA 2 ===");
        peserta2.tampilkanInfo();

        System.out.println("=== DATA PESERTA 3 ===");
        peserta3.tampilkanInfo();
    }
}