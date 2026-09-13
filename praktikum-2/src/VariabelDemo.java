public class VariabelDemo {
    public static void main(String[] args) {
        String nama = "Fathan Nejad Ahmad";
        int umur = 19;
        double tinggi = 165.5;
        char goldarah = 'O';
        boolean mahasiswaAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + goldarah);
        System.out.println("Mahasiswa Aktif: " + mahasiswaAktif);
        int nilaiBulat=9;
        double nilaiDouble=nilaiBulat; //widening otomatis
        System.out.println("Widening: " +nilaiDouble);

        double pecahan =9.8;
        int hasilcasting=(int) pecahan; //narrowing eksplisit
        System.out.println("Narrowing "+hasilcasting);

    }

}
