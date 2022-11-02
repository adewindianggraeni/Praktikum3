public class Main {
    public static void main(String[] args) {

        // Membuat Object
        Mahasiswa anton = new Mahasiswa();

        // Memanggil Atribut dan Memberi Nilai
        System.out.println();
        System.out.println("<<<<<<< PRAKTIKUM 3 >>>>>>>");
        System.out.println();

        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-Laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";

        anton.cetakInfo();
    }
}