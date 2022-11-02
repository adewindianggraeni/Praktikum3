public class Mahasiswa extends Manusia{
    private String nim;
    private String jurusan;

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Getter
    public String getNim() {
        return nim;
    }
    public String getJurusan() {
        return jurusan;
    }

    @Override
    public void cetakInfo() {
        // Memanggil Method Superclass
        super.cetakInfo();
        setNim("10102020");
        setJurusan("Informatika");

        System.out.println("NIM             :" + getNim());
        System.out.println("Jurusan         :" + getJurusan());
    }
}
