public class Latihan1Hewan {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Tom";
        System.out.println("Kucing: " + k.nama);
        k.bersuara();

        Anjing a = new Anjing();
        a.nama = "Spike";
        System.out.println("Anjing: " + a.nama);
        a.bersuara();
    }
}
