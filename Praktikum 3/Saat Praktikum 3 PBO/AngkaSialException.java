/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendri, menolak masukkan angka 13!!
 * Tanggal   : 06-03-2024
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan Memasukkan angka 13 karena angka sial !!!");
    }
}

