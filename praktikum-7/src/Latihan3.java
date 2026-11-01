public class Latihan3 {
    public static void main(String[] args) {
        ProdukLat p1 = new ProdukLat("Laptop", 8500000);
        ProdukLat p2 = new ProdukLat("Mouse", 75000);
        double batas = 1000000;

        System.out.println(p1.namaProduk + " mahal (batas " + batas + ")? " + p1.isMahal(batas));
        System.out.println(p2.namaProduk + " mahal (batas " + batas + ")? " + p2.isMahal(batas));
    }
}