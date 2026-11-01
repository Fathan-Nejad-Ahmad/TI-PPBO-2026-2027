public class Latihan4 {
    public static void main(String[] args) {
        Buku[] daftar = new Buku[5];
        daftar[0] = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        daftar[1] = new Buku("Filosofi Teras", "Henry Manampiring", 2018);
        daftar[2] = new Buku("Atomic Habits", "James Clear", 2018);
        daftar[3] = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980);
        daftar[4] = new Buku("Cantik Itu Luka", "Eka Kurniawan", 2016);

        System.out.println("Buku yang terbit setelah tahun 2015:");
        for (Buku b : daftar) {
            if (b.tahunTerbit > 2015) {
                System.out.println("- " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}
