/**
 * File : MPoligon.java 13-03-2024
 * Penulis : Bima Aditya Aryono
 * Deskripsi : driver class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi= new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: "+persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(3, 4, 5,3);
        System.out.println("Keliling dari segitiga: "+segitiga.hitungKeliling());
        System.out.println("Keliling dari segitiga: "+segitiga.semiPerimeter());
        System.out.println("Luas dari Segitiga adalah: "+segitiga.hitungLuas());

        segitiga.printInfo();
    }
}
