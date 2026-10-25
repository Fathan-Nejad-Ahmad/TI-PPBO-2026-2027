public class Latihan1 {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980);

        b1.tampilkanData();
        System.out.println("-");
        b2.tampilkanData();
    }
}
