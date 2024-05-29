interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga-(harga*0.3);
            }
        };
        // dengan loambda
        IDiskon diskonLebaran = (harga) -> harga -(harga *0.4);
        // dengan lambda dengan bklok statement
        // diskonLebaran diimplemenetasikan tanpa adanya blok statement sehingga tidak memperlukan return
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga*0.1);
        };
        // diskon biasa diimplementasikan dengan blok statement sehingga diperlukan penggunaan return untuk mengembalikan hasil penjumlahan ke dalam harga

        System.out.println("Diskon Merdeka :" + diskonMerdeka.hitungDiskon(450000));
        System.out.println("Diskon Lebaran :" + diskonLebaran.hitungDiskon(450000));
        System.out.println("Diskon Biasa :" + diskonBiasa.hitungDiskon(450000));

    }
}
