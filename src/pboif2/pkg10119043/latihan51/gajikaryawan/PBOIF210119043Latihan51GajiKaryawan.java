/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung gaji karyawan
 */
public class PBOIF210119043Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        String nik = scanner.nextLine();
        manager.setNik(nik);
        
        System.out.print("Masukan Nama : ");
        String nama = scanner.nextLine();
        manager.setNama(nama);
        
        System.out.print("Masukan Golongan (1/2/3) : ");
        int golongan = scanner.nextInt();
        manager.setGolongan(golongan);
        
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        String jabatan = scanner.next();
        manager.setJabatan(jabatan);
        
        System.out.print("Masukan Jumlah Kehadiran : ");
        int kehadiran = scanner.nextInt();
        manager.setKehadiran(kehadiran);
        
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t : " + manager.getNik());
        System.out.println("NAMA\t : " + manager.getNama());
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN\t : " + manager.getJabatan() + "\n");
        System.out.println("TUNJANGAN GOLONGAN\t : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t : " + manager.tunjanganKehadiran(manager.getKehadiran()) + "\n");
        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
        
    }
    
}
