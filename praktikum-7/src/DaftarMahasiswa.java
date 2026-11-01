public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("Budi", "12345", 3.75);
        daftar[1] = new Mahasiswa("Fathan Nejad Ahmad", "2025573010102", 3.61);
        daftar[2] = new Mahasiswa("Mamat", "11111", 3.90);

        for (Mahasiswa m : daftar) {
            m.tampilkanData();
            System.out.println("---");
        }
        int jumlahCumlaude = 0;
        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahCumlaude++ ;
            }
        }
        System.out.println("Jumlah mahasiswa cumlaude: " + jumlahCumlaude);
    }
}
