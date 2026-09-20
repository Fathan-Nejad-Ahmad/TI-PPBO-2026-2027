import java.util.Scanner;

public class KlasifikasiMassaTubuh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan Anda (kg): ");
        double beratbadan= sc.nextDouble();
        System.out.print("Masukkan Tinggi Badan Anda (cm): ");
        double tinggibadan = sc.nextDouble();

        double bmi = beratbadan/((tinggibadan/100) * (tinggibadan/100));
        System.out.println("BMI anda: " +bmi);

        if(bmi <18.5){
            System.out.println("Kurus");

        }else if (bmi<25){
            System.out.println("Normal");
        }else if (bmi<30){
            System.out.println("Gemuk");

        }else{
            System.out.println("Obesitas");
        }
    }
}