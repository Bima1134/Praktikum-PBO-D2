// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Sewa
// Tanggal Dibuat : 02 Mei 2023

public class Sewa{
    public static void main (String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50,1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

    }
}

