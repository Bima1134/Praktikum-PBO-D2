// Nama Program : MGaris.java
// Nama/NIM Pembuat : Bima Aditya Aryono/24060122140113 
// Deskripsi : Main kelas Garis
// Tanggal : 28 - 02- 2024

public class MGaris {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Garis G1 = new Garis(new titik(1,2),new titik(4, 5));

        Garis G2 = new Garis(new titik(), new titik()); // membuat variable titik t1

        G2.setTitikAkhir(new titik(5,7));

        System.out.println("Titik Awal dari G1 adalah = "+G1.titikAwal.getAbsis()+","+G1.titikAwal.getOrdinat()+" dan titik akhirnya adalah= "+G1.titikAkhir.getAbsis()+","+G1.titikAkhir.getOrdinat());
        System.out.println("Panjang dari garis G1 adalah = "+G1.getPanjang());
        
        System.out.println("Gradien dari garis G1 adalah = "+G1.getGradien());
        System.out.println("Gradien dari garis G2 adalah = "+G2.getGradien());

        System.out.println("Apakah tegak lurus antara G1 dengan G2 = "+G1.isTegakLurus(G2));


        Garis G3= G1.getRefleksiY();
        System.out.println("Titik Awal dari G3 adalah = "+G3.titikAwal.getAbsis()+","+G3.titikAwal.getOrdinat()+" dan titik akhirnya adalah= "+G3.titikAkhir.getAbsis()+","+G3.titikAkhir.getOrdinat());
        


    }

}
