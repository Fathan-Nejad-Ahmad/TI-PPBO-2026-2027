import java.util.Scanner;

public class BilBulGanjilGenap {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan : ");
        int bilangan = sc.nextInt();
        int hasil = bilangan % 2;

        if (hasil == 0){
            System.out.println("Bilangan adalah Genap");
        } else {
            System.out.println("Bilangan adalah Ganjil");
        }
    }
}
