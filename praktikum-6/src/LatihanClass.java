public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m2 = new Mahasiswa("Memet", "22222", 3.95);
        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}