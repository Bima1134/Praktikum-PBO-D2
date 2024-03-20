// Nama Program : Lingakaran.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Lingkaran
// Tanggal Dibuat : 20 Maret 2023

package Prak5;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari=r;
    }


    public double hitungLuas(){
        return Math.PI*jejari*jejari;
    }

    public double getJejari() {
        return jejari;
    }
}
