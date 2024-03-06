/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 *             jari - jari lingkaran yang bernilai nol
 */
class Lingkaran{
    private double JariJari;
    public Lingkaran(double JariJari){
        this.JariJari=JariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 *Math.PI*JariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double JariJari=-1;
        assert(JariJari>0):"Jari jari harus lebih dari 0";
        Lingkaran l1 = new Lingkaran(JariJari);
        double kelilingLingkaran = l1.hitungKeliling();
        System.out.println("Keliling Lingkaran ="+kelilingLingkaran);
    }
}
