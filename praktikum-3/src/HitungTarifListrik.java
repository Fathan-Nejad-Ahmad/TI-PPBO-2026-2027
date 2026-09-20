import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //konstanta tarif listik per kWh
        final double tarif_450=500;
        final double tarif_900=1000;
        final double tarif_2200=1500;
        final double tarif_atas_2200=2000;

        System.out.println("Pilihan Daya Listrik: ");
        System.out.println(" 450 VA");
        System.out.println(" 900 VA");
        System.out.println(" 2200 VA");
        System.out.println(" > 2200 VA");
        //input golongan daya
        System.out.print("Masukkan Golongan Daya Listrik: ");
        int daya = sc.nextInt();

        //input pemakaian listrik
        System.out.print("Jumlah Pemakaian Listrik(kWh): ");
        double pemakaian= sc.nextDouble();

        //validasi pemakaian menggunakan operator logika
        if(pemakaian<=0){
            System.out.println("Error");
            return;
        }
        double tarif =0;
        String golongan ="";
        //menentukan golongan daya dan tarif
        if(daya ==450){
            golongan= "450 VA";
            tarif=tarif_450;
        } else if (daya==900) {
            golongan="900 VA";
            tarif =tarif_900;

        }else if(daya==2200) {
            golongan="2200 VA";
            tarif =tarif_2200;

        }else if(daya>2200){
            golongan="Di Atas 2200 VA";
            tarif = tarif_atas_2200;
        }else{
            System.out.println("Error");
        }
        //rumus menghitung total tagihan
        double totaltagihan= pemakaian*tarif;

        //menampilkan hasil
        System.out.println("-- Tagihan Listik --");
        System.out.println("Golongan Daya: "+golongan);
        System.out.println("Jumlah kWh: "+pemakaian);
        System.out.println("Tarif Per kWh: "+tarif);
        System.out.println("Total Tagihan: "+totaltagihan);

    }
}