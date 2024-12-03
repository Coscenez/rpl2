package pertemuan2_50421430;

public class Pertemuan2_50421430 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Sultan", "50421430", 21);
        mahasiswa.tampilkanData();
        System.out.println();
        
        MahasiswaSarjana mahasiswasarjana = new MahasiswaSarjana("Fachridt", "50421430", 21, "Informatika");
        mahasiswasarjana.tampilkanData();
        System.out.println();
    }
    
}
