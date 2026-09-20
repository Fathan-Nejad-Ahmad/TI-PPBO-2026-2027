import java.util.Scanner;

public class MakananSederhana {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("--- Menu Makanan ---");
        System.out.println("Bubur Ayam");
        System.out.println("Mie Pangsit");
        System.out.println("Nasi Kebuli");
        System.out.println("Sate Padang");

        System.out.print("Pilih Makanan(1-4): ");
        int pilihan = sc.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("Anda Memilih Bubur Ayam");
                break;
            case 2:
                System.out.println("Anda Memilih Mie Pangsit");
                break;
            case 3:
                System.out.println("Anda Memilih Nasi Kebuli");
                break;
            case 4:
                System.out.println("Anda Memilih Sate Padang");
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
    }
}