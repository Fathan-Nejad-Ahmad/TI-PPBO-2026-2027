import java.util.Scanner;

public class UmurDanStatus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda: ");
        int umur = sc.nextInt();

        System.out.print("Apakah Anda Mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        if(mahasiswa||umur<25){
            System.out.println("Mendapat Harga Khusus/Diskon");

        }else{
            System.out.println("Harga Normal");
        }
    }
}