public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        Staff stf = new Staff("Siti", "S001", 5000000, 1000000);
        Direktur dir = new Direktur("Andi", "D001", 9500000, 5000000, 3000000);

        System.out.println("=== Manager ===");
        mgr.tampilkanData();   // warisan dari Pegawai
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        System.out.println("=== Staff ===");
        stf.tampilkanData();   // warisan dari Pegawai
        System.out.println("Tunjangan Kinerja: " + stf.getTunjanganKinerja());

        System.out.println("=== Direktur ===");
        dir.tampilkanData();   // warisan melalui 2 tingkat (Manager -> Pegawai)
        System.out.println("Tunjangan Jabatan: " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham  : " + dir.getTunjanganSaham());

        System.out.println("=== Uji validasi gaji negatif ===");
        Staff stf2 = new Staff("Dodi", "S002", -1000000, 500000);
        stf2.tampilkanData();
    }
}
