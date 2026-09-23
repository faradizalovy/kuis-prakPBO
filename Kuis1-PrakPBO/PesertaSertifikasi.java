public class PesertaSertifikasi {
    private final String idPeserta;
    private String nama;
    private double nilaiPraktik;
    private double nilaiTeori;
    private double nilaiProyek;

    public PesertaSertifikasi(String idPeserta, String nama) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.nilaiPraktik = 0;
        this.nilaiTeori = 0;
        this.nilaiProyek = 0;
    }
    public String getIdPeserta() {
        return idPeserta;
    }
    public String getNama() {
        return nama;
    }
    public double getNilaiPraktik() {
        return nilaiPraktik;
    }
    public double getNilaiTeori() {
        return nilaiTeori;
    }
    public double getNilaiProyek() {
        return nilaiProyek;
    }
    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong.");
        }
    }
    public void setNilaiPraktik(double nilaiPraktik) {
        if (nilaiValid(nilaiPraktik)) {
            this.nilaiPraktik = nilaiPraktik;
        } else {
            System.out.println("Nilai praktik ditolak: nilai harus berada pada rentang 0-100.");
        }
    }
    public void setNilaiTeori(double nilaiTeori) {
        if (nilaiValid(nilaiTeori)) {
            this.nilaiTeori = nilaiTeori;
        } else {
            System.out.println("Nilai teori ditolak: nilai harus berada pada rentang 0-100.");
        }
    }
    public void setNilaiProyek(double nilaiProyek) {
        if (nilaiValid(nilaiProyek)) {
            this.nilaiProyek = nilaiProyek;
        } else {
            System.out.println("Nilai proyek ditolak: nilai harus berada pada rentang 0-100.");
        }
    }
    private boolean nilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
    public double hitungNilaiAkhir() {
        return (nilaiPraktik * 0.40) + (nilaiTeori * 0.30) + (nilaiProyek * 0.30);
    }
    public boolean isLulus() {
        double nilaiAkhir = hitungNilaiAkhir();
        return nilaiAkhir >= 70&& nilaiPraktik >= 60 && nilaiTeori >= 60 && nilaiProyek >= 60;
    }
    public void tampilkanInfo() {
        System.out.println("ID Peserta   : " + idPeserta);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Praktik: " + nilaiPraktik);
        System.out.println("Nilai Teori  : " + nilaiTeori);
        System.out.println("Nilai Proyek : " + nilaiProyek);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Status       : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
        System.out.println();
    }
}