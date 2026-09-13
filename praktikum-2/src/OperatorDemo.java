public class OperatorDemo {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("Jumlah: " + (a + b));
        System.out.println("selisih: " + (a - b));
        System.out.println("kali: " + (a * b));
        System.out.println("bagi: " + (a / b));
        System.out.println("hasil bagi: " + (a % b));
        int nilaiujian= 80;
        boolean hadir =true;
        System.out.println("lulus (>=75):" +(nilaiujian >= 75));
        System.out.println("lulus dan hadir: " +(nilaiujian >= 75 && hadir));
    }
}