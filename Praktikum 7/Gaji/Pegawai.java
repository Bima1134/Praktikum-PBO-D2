
// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Pegawai
// Tanggal Dibuat : 02 Mei 2023
package Gaji;


public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama=nama;
    }

    public void tampilData(){
        System.out.println("Nama :"+nama+" Gaji Pokok : "+gajiPokok);
    }

}
