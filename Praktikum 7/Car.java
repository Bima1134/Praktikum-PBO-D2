// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Car
// Tanggal Dibuat : 02 Mei 2023

public class Car extends Vehicle {
    void calRent(int jarak,float harga){
        float fare= jarak*harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}


