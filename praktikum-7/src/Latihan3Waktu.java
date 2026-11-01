public class Latihan3Waktu {
    public static void main(String[] args) {
        Waktu w = new Waktu(10, 30, 45);
        System.out.println("Waktu awal: " + w.format());

        w.setJam(25);     // ditolak
        w.setMenit(60);   // ditolak
        w.setDetik(-1);   // ditolak
        System.out.println("Setelah nilai tidak valid: " + w.format());

        w.setJam(23);
        w.setMenit(59);
        w.setDetik(59);
        System.out.println("Setelah nilai valid: " + w.format());

        System.out.println("--- Constructor dengan nilai tidak valid ---");
        Waktu w2 = new Waktu(30, 70, 80);
        System.out.println("Waktu w2: " + w2.format());
    }
}
