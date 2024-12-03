/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2_50421495;

/**
 *
 * @author ASUS
 */
public class Pertemuan2_50421495 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Fauzan", "50421495", 21);
        mahasiswa.tampilkanData();
        System.out.println();
        
        MahasiswaSarjana mahasiswasarjana = new MahasiswaSarjana("Fanindra", "50421234", 21, "Informatika");
        mahasiswasarjana.tampilkanData();
        System.out.println();
    }
    
}
