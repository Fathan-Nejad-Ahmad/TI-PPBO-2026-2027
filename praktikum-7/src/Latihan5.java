public class Latihan5 {
    public static void main(String[] args) {
        Persegi[] daftar = new Persegi[4];
        daftar[0] = new Persegi(3);
        daftar[1] = new Persegi(12);
        daftar[2] = new Persegi(5.5);
        daftar[3] = new Persegi(9);

        Persegi terbesar = daftar[0];
        for (Persegi p : daftar) {
            if (p.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = p;
            }
        }
        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi   : " + terbesar.sisi);
        System.out.println("Luas   : " + terbesar.hitungLuas());
    }
}
