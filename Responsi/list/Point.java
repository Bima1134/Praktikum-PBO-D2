/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas Point untuk Queue of Point dan Stack of Point
 * Tanggal dibuat : 27 Maret 2024
 */

package list;
public class Point {
    //atribut
    private double absis;
    private double ordinat;
      
    //konstruktor
    public Point(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }
    public Point(){
        this(0,0);
    }
    
    //method
    // selektor
    public double getOrdinat(){
        return this.ordinat;
    }
    
    public double getAbsis(){
        return this.absis;
    }

    // prosedur
    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    // implementasi prosedur cetak pada  point
    public void cetak(){
        System.out.println("("+absis+","+ordinat+")");
    }
}
