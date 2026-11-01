import java.util.Locale;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah kurangi stok harus lebih dari 0");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi");
        } else {
            stok -= jumlah;
            System.out.println("Stok berkurang. Stok sekarang: " + stok);
        }
    }

    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + String.format(Locale.of("id", "ID"), "%,.0f", harga));
        System.out.println("Stok        : " + stok);
    }
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif");
        } else {
            this.harga = harga;
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tambah stok harus lebih dari 0");
            return;
        }
        stok += jumlah;
        System.out.println("Stok bertambah. Stok sekarang: " + stok);
    }
}
