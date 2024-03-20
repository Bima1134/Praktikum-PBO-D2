// Nama Program : MBujurSangkar.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Main atau realisasi Main Bujur Sangkar
// Tanggal Dibuat : 20 Maret 2023


package Prak5;

import java.util.Scanner;


/**
 * MBujurSangkar
 */
public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar");

        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}