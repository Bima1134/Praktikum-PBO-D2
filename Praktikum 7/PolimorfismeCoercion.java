// Nama Program : PolimorfismeCoercion.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Polimorfisme Coercion
// Tanggal Dibuat : 02 Mei 2023
public class PolimorfismeCoercion {
    public static int kuadrat (int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String [] args){
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil Kuadrat %d adalah %d", bilangan,hasilKuadrat);
    }
}
