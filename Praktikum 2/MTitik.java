// Nama Program : MTitik.java
// Nama/NIM Pembuat : Bima Aditya Aryono/24060122140113 
// Deskripsi : Main kelas titik
// Tanggal : 21 - 02- 2024

public class MTitik {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        titik t1 = new titik(); // membuat variable titik t1
        titik t2 = new titik(); // membuat variable titik t2

        t1.setAbsis(10);
        t1.setOrdinat(10);
        t2.setOrdinat(6.5);

        titik t3 = new titik(5,6);


        titik tnew = t3.getRefleksiX();
        titik tnew2 = t3.getRefleksiY();



        System.out.printf("absis dari t1= %.1f Ordinat dari t1 = %.1f",t1.getAbsis(),t1.getOrdinat());
        System.out.println("\nabsis dari t2="+t2.getAbsis()+", Ordinat dari t2 ="+t2.getOrdinat());
        System.out.printf("absis dari t3= %.1f Ordinat dari t3 = %.1f",t3.getAbsis(),t3.getOrdinat());
        System.out.println("\nabsis dari tnew="+tnew.getAbsis()+", Ordinat dari tnew ="+tnew.getOrdinat());

        System.out.println("\nrefleksi dari titik t3 terhadap sumbu X adalah = "+tnew.getAbsis()+","+tnew.getOrdinat());
        System.out.println("\nrefleksi dari titik t3 terhadap sumbu Y adalah = "+tnew2.getAbsis()+","+tnew2.getOrdinat());

        t1.refleksiX();
        t2.refleksiY();

        System.out.printf("absis dari t1 setelah direfleksikan ke sumbu X= %.1f Ordinat dari t1 setelah direfleksikan terhadap sumbu X= %.1f",t1.getAbsis(),t1.getOrdinat());
        System.out.println("\nabsis dari t2 setelah direfleksikan ke sumbu Y="+t2.getAbsis()+", Ordinat t2 setelah direfleksikan ke sumbu Y="+t2.getOrdinat());

        System.out.println("\nJarak titik t1 ke titik pusat = "+t1.getJarakPusat());




    }

}
