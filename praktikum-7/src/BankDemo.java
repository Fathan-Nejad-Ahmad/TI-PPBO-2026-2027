public class BankDemo {
    public static void main(String[] args) {
        // Membuat minimal 2 object RekeningBank[span_7](start_span)[span_7](end_span)
        RekeningBank rek1 = new RekeningBank("R001", "Budi", "Tabungan", 200000);
        RekeningBank rek2 = new RekeningBank("R002", "Ani", "Giro", 150000);

        System.out.println("--- UJI COBA SETOR & TARIK ---");
        rek1.setor(50000);
        rek2.tarik(30000);
        System.out.println();

        System.out.println("--- UJI COBA TRANSFER ---");
        // Satu transfer yang BERHASIL antar kedua rekening[span_8](start_span)[span_8](end_span)
        rek1.transferKe(rek2, 50000);

        // Satu transfer yang GAGAL (saldo tidak cukup atau jumlah tidak valid)[span_9](start_span)[span_9](end_span)
        rek1.transferKe(rek2, 1000000); // Gagal: Saldo tidak cukup
        rek1.transferKe(rek2, -10000);  // Gagal: Jumlah tidak valid (negatif)
        System.out.println();

        System.out.println("--- CETAK MUTASI AKHIR ---");
        // Mencetak mutasi akhir kedua rekening menggunakan cetakMutasi()[span_10](start_span)[span_10](end_span)
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}