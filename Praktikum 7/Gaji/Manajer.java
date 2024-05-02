// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas Manajer
// Tanggal Dibuat : 02 Mei 2023
package Gaji;
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.setNama(nama);
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}

