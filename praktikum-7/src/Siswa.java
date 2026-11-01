public class Siswa {
    private double nilai;   // 0 - 100

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid, harus 0 - 100");
        }
    }

    // Mengembalikan nilai huruf berdasarkan nilai yang tersimpan
    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 55) {
            return 'C';
        } else if (nilai >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
