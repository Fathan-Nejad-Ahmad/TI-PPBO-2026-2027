public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }
    public Mahasiswa(String nama, String nim, Double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public void  tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }
}

