public class Latihan4Siswa {
    public static void main(String[] args) {
        Siswa s = new Siswa();

        s.setNilai(88);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(72.5);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(120);   // ditolak
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(-5);    // ditolak
        s.setNilai(30);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());
    }
}
