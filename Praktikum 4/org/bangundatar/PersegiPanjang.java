/**
 * File : PersegiPanjang.java 13-03-2024
 * Penulis : Bima Aditya Aryono
 * Deskripsi :representasi dari objek persegi panjang,turunan kelas poligon
 */

package org.bangundatar;

import org.Poligon.poligon;

public class PersegiPanjang extends poligon {
    // atribut
    private double panjang,lebar;
    // method

    //konstruktor
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.jumlahSisi=jumlahSisi;
    }
    //fungsi luas
    public double hitungLuas(){
        return panjang*lebar;
    }
    // procedure info sisi
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
    }
    
}
