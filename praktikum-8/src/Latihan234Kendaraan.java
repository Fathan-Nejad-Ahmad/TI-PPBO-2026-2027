public class Latihan234Kendaraan {
    public static void main(String[] args) {
        System.out.println("--- Mobil ---");
        Mobil m = new Mobil("Toyota Avanza", 170, 5);
        m.tampilkanInfo();

        System.out.println("--- Motor ---");
        Motor s = new Motor("Honda Beat", 100, "Matic");
        s.tampilkanInfo();
    }
}
