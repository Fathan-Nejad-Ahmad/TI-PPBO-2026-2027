public class Latihan1n2Buku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java", "Budi Santoso", 2022);
        System.out.println("Sebelum : " + b1.getJudul() + " - " + b1.getPengarang()
                + " (" + b1.getTahunTerbit() + ")");

        b1.setJudul("Pemrograman Java Lanjut");
        b1.setPengarang("Siti Aminah");
        System.out.println("Sesudah : " + b1.getJudul() + " - " + b1.getPengarang()
                + " (" + b1.getTahunTerbit() + ")");

        // b1.setTahunTerbit(2024);   // error: method tidak ada (read-only)
    }
}
