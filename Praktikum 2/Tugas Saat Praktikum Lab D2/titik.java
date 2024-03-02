// Nama Program : titik.java
// Nama/NIM Pembuat : Bima Aditya Aryono/24060122140113 
// Deskripsi : Header kelas titik
// Tanggal : 21 - 02- 2024

public class titik {
    // atribut

    // objek
    private double absis;
    private double ordinat;

    //class
    // static int countertitik;
    // method

    //konstruktor
    public titik(double absis, double ordinat){  // konstruktor mendefine absis dan ordinat
        // countertitik++;
        this.absis=absis;
        this.ordinat=ordinat;
    }

    public titik(){ // konstruktor di titik 90,0)
        // countertitik++;
        absis=0;
        ordinat=0;
    }
    // mutator / setter objek
    public void setAbsis(double a){ // set absis dengan input
        absis=a;
    }

    public void setOrdinat(double o){ // set ordinat dengan input
        ordinat=o;
    }

    // selektor/getter objek
    public double getAbsis(){ // mendapatkan nilai absis dan dikembalikan dengan nilai real
        return absis;
    }

    public double getOrdinat(){ // mendapatkan nilai ordinat dan dikembalikan dengan nilai real
        return ordinat;
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis,2)+Math.pow(ordinat,2));
    }

    public void refleksiX(){
        ordinat= -ordinat;
    }           

    public void refleksiY(){
        absis = -absis;
    }

    public titik getRefleksiX(){
        return new titik(this.absis,-this.ordinat);
    }

    public titik getRefleksiY(){
        return new titik(-this.absis,this.ordinat);
    }


    // selektor class 

    // static int getCountertitik(){ // method class mendapatkan jumlah titik
    //     return countertitik;
    // }
}
