public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks); // Latihan 3: constructor chaining
        this.jumlahPintu = jumlahPintu;
    }

    // Latihan 4: mengakses atribut protected LANGSUNG (tanpa getter)
    public void tampilkanInfo() {
        System.out.println("Merek          : " + merek);
        System.out.println("Kecepatan maks : " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah pintu   : " + jumlahPintu);
    }
}
