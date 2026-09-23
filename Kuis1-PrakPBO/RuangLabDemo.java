public class RuangLabDemo {
    public static void main(String[] args) {

        RuangLab ruang1 = new RuangLab("LAB01", "Laboratorium Komputer 1", 30);
        RuangLab ruang2 = new RuangLab("LAB02", "Laboratorium Komputer 2", 25);
        RuangLab ruang3 = new RuangLab("LAB03", "Laboratorium Jaringan", 20);

        System.out.println("=== INFORMASI AWAL RUANG ===");
        ruang1.tampilkanInfo();
        ruang2.tampilkanInfo();
        ruang3.tampilkanInfo();

        // Pengujian 1 - berhasil
        System.out.println("=== PENGUJIAN 1 ===");
        ruang1.pesanRuang(20);

        // Pengujian 2 - berhasil
        System.out.println("\n=== PENGUJIAN 2 ===");
        ruang2.pesanRuang(15);

        // Pengujian 3 - ditolak karena jumlah peserta 0
        System.out.println("\n=== PENGUJIAN 3 ===");
        ruang3.pesanRuang(0);

        // Pengujian 4 - ditolak karena melebihi kapasitas
        System.out.println("\n=== PENGUJIAN 4 ===");
        ruang3.pesanRuang(25);

        // Pengujian 5 - ditolak karena ruang sudah dipesan
        System.out.println("\n=== PENGUJIAN 5 ===");
        ruang1.pesanRuang(10);

        // Pengujian 6 - pembatalan berhasil
        System.out.println("\n=== PENGUJIAN 6 ===");
        ruang1.batalkanPesanan();

        // Pengujian 7 - pembatalan ditolak karena ruang masih tersedia
        System.out.println("\n=== PENGUJIAN 7 ===");
        ruang3.batalkanPesanan();

        // Menampilkan kondisi akhir
        System.out.println("\n=== INFORMASI AKHIR RUANG ===");
        ruang1.tampilkanInfo();
        ruang2.tampilkanInfo();
        ruang3.tampilkanInfo();
    }
}