public class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    // Mengakses saldo (protected, milik Akun) dan batasKredit (private, milik sendiri)
    public void cekLimit() {
        System.out.println("Username        : " + username);
        System.out.println("Saldo           : " + saldo);
        System.out.println("Batas kredit    : " + batasKredit);
        System.out.println("Total dana maks : " + (saldo + batasKredit));
    }
}
