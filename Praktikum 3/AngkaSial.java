/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Tanggal   : 06-03-2024
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(35);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka !!!");
        }
    }
}
