public class RuangLab {
    private final String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    public RuangLab(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true;
    }
    public String getIdRuang() {
        return idRuang;
    }
    public String getNamaRuang() {
        return namaRuang;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setNamaRuang(String namaRuang) {
        if (namaRuang != null && !namaRuang.isEmpty()) {
            this.namaRuang = namaRuang;
        } else {
            System.out.println("Nama ruang tidak boleh kosong.");
        }
    }
    public void setKapasitas(int kapasitas) {
        if (kapasitas > 0) {
            this.kapasitas = kapasitas;
        } else {
            System.out.println("Kapasitas harus lebih dari 0.");
        }
    }
    public void pesanRuang(int jumlahPeserta) {
        if (!tersedia) {
            System.out.println("Pemesanan ditolak: ruang " + idRuang + " sedang dipesan.");
        } else if (jumlahPeserta <= 0) {
            System.out.println("Pemesanan ditolak: jumlah peserta harus lebih dari 0.");
        } else if (jumlahPeserta > kapasitas) {
            System.out.println("Pemesanan ditolak: jumlah peserta (" + jumlahPeserta + ") melebihi kapasitas ruang (" + kapasitas + ").");
        } else {
            tersedia = false;
            System.out.println("Pemesanan berhasil: ruang " + idRuang + " dipesan untuk " + jumlahPeserta + " peserta.");
        }
    }
    public void batalkanPesanan() {
        if (tersedia) {
            System.out.println("Pembatalan ditolak: ruang " + idRuang + " belum sedang dipesan.");
        } else {
            tersedia = true;
            System.out.println("Pembatalan berhasil: ruang " + idRuang + " sekarang tersedia kembali.");
        }
    }
    public void tampilkanInfo() {
        System.out.println("ID Ruang     : " + idRuang);
        System.out.println("Nama Ruang   : " + namaRuang);
        System.out.println("Kapasitas    : " + kapasitas);
        System.out.println("Ketersediaan : "
                + (tersedia ? "Tersedia" : "Sedang dipesan"));
        System.out.println();
    }
}