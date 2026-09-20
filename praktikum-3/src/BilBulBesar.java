import java.util.Scanner;

public class BilBulBesar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan-1: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan-2 : ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan Bilangan-3 : ");
        int bil3 = sc.nextInt();

        if (bil1 > bil2 && bil1 > bil3){
            System.out.println("Bilangan Terbesar adalah : " + bil1);
        } else if (bil2 > bil1 && bil2 > bil3) {
            System.out.println("Bilangan Terbesar adalah : " + bil2);
        } else if (bil3 > bil1 && bil3 > bil2) {
            System.out.println("Bilangan Terbesar adalah : " + bil3);
        } else {
            System.out.println("Bilangan Tidak Terdeteksi");
        }
    }
}
