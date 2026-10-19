public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }
    public Mahasiswa(String namaAwal, String nimAwal, Double ipkAwal) {
            nama = namaAwal;
            nim = nimAwal;
            ipk = ipkAwal;
        }
    }
