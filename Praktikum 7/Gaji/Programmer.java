// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Kelas programmer
// Tanggal Dibuat : 02 Mei 2023

package Gaji;
public class Programmer extends Pegawai{
    private int tunjangan = 450000;

    public Programmer(String nama){
        super.setNama(nama);
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}

