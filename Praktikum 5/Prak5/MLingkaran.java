// Nama Program : BangunDatar.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Main atau realisasi kelas Lingkaran 
// Tanggal Dibuat : 20 Maret 2023

package Prak5;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10.2);
        Scanner scan = new Scanner(System.in);

        double jejari1= scan.nextDouble();
        Lingkaran lingkaran2 = new Lingkaran(jejari1);


        System.out.println("Luas Lingkaran dengan jejari "+ lingkaran.getJejari()+" satuan adalah "+lingkaran.hitungLuas());
        System.out.println("Luas Lingkaran dengan jejari "+ jejari1+" satuan adalah "+lingkaran2.hitungLuas());
    }
    
}
