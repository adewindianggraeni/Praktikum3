public class Main {
    public static void main(String[] args) {

        // Membuat Object
        Pegawai manager = new Manager();
        Pegawai programmer = new Programmer();

        // Memanggil Atribut dan Memberi Nilai
        System.out.println();
        System.out.println("<<<<<<< TUGAS PERTEMUAN 6 >>>>>>>");
        System.out.println();

        System.out.println("======= Manager =======");
        manager.cetakInfo();

        System.out.println();

        System.out.println("======= Programmer =======");
        programmer.cetakInfo();
    }
}