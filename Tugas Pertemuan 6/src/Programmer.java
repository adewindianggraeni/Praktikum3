public class Programmer extends Pegawai {
    private double bonus;

    // Setter
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter
    public double getBonus() {
        return bonus;
    }

   @Override
    public void cetakInfo() {
        // Memanggil Method Superclass
        super.cetakInfo();
        cetakBonus();
    }
    public void cetakBonus() {
        setNama("Anonymous");
        setGajiPokok(6000000);
        setBonus(3000000);

        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Bonus           : " + getBonus());
    }
}
