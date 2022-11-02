public class Manager extends Pegawai {
    private double tunjangan;

    // Setter
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter
    public double getTunjangan() {
        return tunjangan;
    }

   @Override
    public void cetakInfo () {
        // Memanggil Method Superclass
        super.cetakInfo();
        cetakTunjangan();
    }

    public void cetakTunjangan() {
        setNama("Ade Windi Anggraeni");
        setGajiPokok(9000000);
        setTunjangan(7000000);

        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}
