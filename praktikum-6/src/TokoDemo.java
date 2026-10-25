import java.util.Locale;

public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftar = new Produk[5];
        daftar[0] = new Produk("P001", "Laptop", 8500000, 10);
        daftar[1] = new Produk("P002", "Mouse Wireless", 125000, 50);
        daftar[2] = new Produk("P003", "Keyboard Mekanik", 650000, 5);
        daftar[3] = new Produk("P004", "Monitor 24 inci", 1800000, 8);
        daftar[4] = new Produk("P005", "Headset", 350000, 2);

        // 1. Tampilkan seluruh data produk
        System.out.println("=== DAFTAR PRODUK ===");
        for (Produk p : daftar) {
            p.tampilkanData();
            System.out.println("-----------------------");
        }

        // 2. Simulasi pembelian
        System.out.println("=== SIMULASI PEMBELIAN ===");

        // Skenario 1: stok mencukupi
        System.out.println("Pembelian 1: 3 unit " + daftar[1].namaProduk);
        System.out.println("Total harga : Rp" + String.format(Locale.of("id", "ID"), "%,.0f", daftar[1].hitungTotalHarga(3)));
        daftar[1].kurangiStok(3);

        // Skenario 2: stok TIDAK mencukupi
        System.out.println();
        System.out.println("Pembelian 2: 5 unit " + daftar[4].namaProduk);
        System.out.println("Total harga : Rp" + String.format(Locale.of("id", "ID"), "%,.0f", daftar[4].hitungTotalHarga(5)));
        daftar[4].kurangiStok(5);

        // 3. Cari produk termahal
        Produk termahal = daftar[0];
        for (Produk p : daftar) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        System.out.println();
        System.out.println("=== PRODUK TERMAHAL ===");
        System.out.println(termahal.namaProduk + " - Rp" + String.format(Locale.of("id", "ID"), "%,.0f", termahal.harga));
    }
}
