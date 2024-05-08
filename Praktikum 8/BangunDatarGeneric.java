/*
 * Nama / NIM : Bima Aditya Aryono / 24060122140113
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric <T1 extends BangunDatar>{
    private T5  BangunDatar;

    public  void set (T2 tipebangunDATAR){
        BangunDatar= tipebangunDATAR;
    }

    public T3 get(){
        return BangunDatar;
    }

    public double hitungKeliling(){
        return BangunDatar.hitungKeliling();
    }
}

/*?
 * Dengan mengubah Segala T ke menjadi T yang berbeda beda maka akan membuat tidak bisa dipanggil BangunDatarGeneric karena pada tupple digunakan T1 untuk heritance BangunDatar.java sehingga harus
 * tetap menggunakan T1
 */
