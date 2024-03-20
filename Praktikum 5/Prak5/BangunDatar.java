// Nama Program : BangunDatar.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Abstrak BangunDatar
// Tanggal Dibuat : 20 Maret 2023

package Prak5;
public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas=l;
    }

    public double getLuas(){
        return luas;
    }
}
