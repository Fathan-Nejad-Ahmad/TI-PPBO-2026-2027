public class Latihan5Produk {
    public static void main(String[] args) {
        Produk p = new Produk("P001", "Pulpen", 3500, 50);
        System.out.println(p.getKodeProduk() + " | " + p.getNamaProduk()
                + " | Rp" + p.getHarga() + " | stok " + p.getStok());

        p.setHarga(4000);    // valid
        p.setHarga(-100);    // ditolak
        System.out.println("Harga sekarang: Rp" + p.getHarga());

        p.tambahStok(20);    // valid
        p.tambahStok(0);     // ditolak
        p.kurangiStok(30);   // valid
        p.kurangiStok(100);  // ditolak, stok tidak cukup
        p.kurangiStok(-5);   // ditolak

        System.out.println("Stok akhir: " + p.getStok());
    }
}
