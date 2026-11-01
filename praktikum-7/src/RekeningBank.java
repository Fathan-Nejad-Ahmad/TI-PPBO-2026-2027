public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening; // Atribut read-only (hanya diisi lewat constructor)[span_2](start_span)[span_2](end_span)
    private double saldo;

    // Constructor
    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    // Getter (jenisRekening hanya memiliki getter sehingga bersifat read-only)[span_3](start_span)[span_3](end_span)
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Setor
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo " + pemilik + ": " + saldo);
    }

    // Method Tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo " + pemilik + " tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo " + pemilik + ": " + saldo);
        }
    }

    // Method Transfer Ke Rekening Lain (dengan validasi jumlah positif dan saldo mencukupi)[span_4](start_span)[span_4](end_span)
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: Jumlah transfer harus bernilai positif.");
        } else if (jumlah > saldo) {
            System.out.println("Transfer GAGAL: Saldo " + pemilik + " tidak mencukupi.");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL sebesar " + jumlah + " dari " + this.pemilik + " ke " + tujuan.pemilik);
        }
    }

    // Method Cetak Mutasi (menampilkan nomor rekening, pemilik, jenis rekening, dan saldo rapi)[span_5](start_span)[span_5](end_span)
    public void cetakMutasi() {
        System.out.println("=== LAPORAN MUTASI REKENING ===");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat Ini : " + saldo);
        System.out.println("===============================\n");
    }
}