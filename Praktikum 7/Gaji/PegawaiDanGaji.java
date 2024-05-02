// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Main Pegawai(Programmer,Manajer) dan Payroll
// Tanggal Dibuat : 02 Mei 2023

package Gaji;
public class PegawaiDanGaji {
    public static void main (String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();

        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
