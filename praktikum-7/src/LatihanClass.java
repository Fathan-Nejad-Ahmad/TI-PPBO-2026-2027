//public class LatihanClass {
//    public static void main(String[] args){
//        Mahasiswa m2 = new Mahasiswa("Memet", "22222", 3.95);
//        m2.tampilkanData();
//        System.out.println("Cumlaude? " + m2.isCumlaude());
//    }
//}
public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);

        m1.ipk = 9.9;   // seharusnya TIDAK MASUK AKAL, IPK maksimal 4.0
        m1.nim = "";    // NIM kosong, seharusnya tidak valid

        System.out.println(m1.ipk);
    }
}