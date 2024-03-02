// Nama Program : Garis.java
// Nama/NIM Pembuat : Bima Aditya Aryono/24060122140113 
// Deskripsi : Header kelas Garis
// Tanggal : 28 - 02- 2024

public class Garis {
    // atribut

    // objek
    titik titikAwal;
    titik titikAkhir;

    // method

    public Garis(titik titikAwal,titik titikAkhir){
        this.titikAkhir=titikAkhir;
        this.titikAwal=titikAwal;
    }

    public titik getTitikAkhir() {
        return titikAkhir;
    }

    public titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAkhir(titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public void setTitikAwal(titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getOrdinat()-titikAwal.getOrdinat(),2)+Math.pow(titikAkhir.getAbsis()-titikAwal.getAbsis(),2 ));
    }

    public double getGradien(){
        return (titikAkhir.getOrdinat()-titikAwal.getOrdinat())/(titikAkhir.getAbsis()-titikAwal.getAbsis());
    }

    public Garis getRefleksiY(){
        return new Garis(this.titikAwal.getRefleksiY(),this.titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(Garis G){
        return (this.getGradien() * G.getGradien())==-1;
    }
}
