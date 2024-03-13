/**
 * File : Segitiga.java 13-03-2024
 * Penulis : Bima Aditya Aryono
 * Deskripsi :representasi dari objek Segitiga,turunan kelas poligon
 */


package org.bangundatar;

import org.Poligon.poligon;


public class Segitiga extends poligon {
    private double sisi1,sisi2,sisi3;
    
    public Segitiga(double sisi1,double sisi2,double sisi3){
        this.sisi1=sisi1;
        this.sisi2=sisi2;
        this.sisi3=sisi3;
    }

    public double hitungKeliling(){
        return sisi1+sisi2+sisi3;
    }

    public double semiPerimeter(){
        return this.hitungKeliling()/2;
    }

    public double hitungLuas(){
        return Math.sqrt((this.semiPerimeter() * (this.semiPerimeter()-this.sisi1)) * (this.semiPerimeter()-this.sisi2) * (this.semiPerimeter()- this.sisi3));
    }
}
