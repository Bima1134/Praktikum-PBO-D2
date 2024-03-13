/**
 * File : Segitiga.java 13-03-2024
 * Penulis : Bima Aditya Aryono
 * Deskripsi :representasi dari objek Segitiga,turunan kelas poligon
 */


package org.bangundatar;

import org.Poligon.poligon;


public class Segitiga extends poligon {
    // atribut
    private double sisi1,sisi2,sisi3;
    // konstruktor
    public Segitiga(double sisi1,double sisi2,double sisi3,int jumlahSisi){
        this.sisi1=sisi1;
        this.sisi2=sisi2;
        this.sisi3=sisi3;
        this.jumlahSisi=jumlahSisi;
    }
    // fungsi menghitung keliling
    public double hitungKeliling(){
        return sisi1+sisi2+sisi3;
    }
    // fungsi menghitung setengah keliling
    public double semiPerimeter(){
        return this.hitungKeliling()/2;
    }
    // procedure print info jumlah sisi segitiga
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
    }

    // fungsi menghitung luas Segitiga
    public double hitungLuas(){
        return Math.sqrt((this.semiPerimeter() * (this.semiPerimeter()-this.sisi1)) * (this.semiPerimeter()-this.sisi2) * (this.semiPerimeter()- this.sisi3));
    }
}
