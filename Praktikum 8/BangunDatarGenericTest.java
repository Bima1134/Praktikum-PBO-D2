/*
 * Nama / NIM : Bima Aditya Aryono / 24060122140113
 * File : BangunDatar.java
 * Deskripsi : kelas abstrak untuk bangun datar
 */

 public class BangunDatarGenericTest{
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg=
        new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);

        System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe Generic : "+ bdg.get().getClass().getName());
    }
 }