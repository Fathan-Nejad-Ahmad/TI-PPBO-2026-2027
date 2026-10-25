public class ProdukLat {
    String namaProduk;
    double harga;

    public ProdukLat(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}