public class prak6 {
    public static void main (String[] args){
        // overloading adalah polimorfisme pada metode yaitu pada kelas yang sama terdapat beberapa metode yang sama tetapi dengan parameter yang berbeda bisa dari jumlah parameter nya, atau bahkan sama 
        // tapi dengan tipe data yang berbeda
        // contoh:
      public class Employee {
        private int id;
        private String name;
        public Employee(){
            
        }
        
        public Employee(int id, String name) {
          this.id = id;
          this.name = name;
        }
      }

      int output1= 'a';
      double x = 15.5;
      int output2 =  x;
      // int output2 = (int) x; output2 akan gagal karena untuk real ke integer perlu adanya casting untuk mengubah tipe datanya sehingga tidak bisa terjadi coercion
      int z = 78;
      char output3= (char) z;
      char a = 'a';
      double output4 = a;

      System.out.println(output1);
      // berhasil dikarenakan nanti huruf a akan diubah menjadi angka ascii, sehingga dapat terjadi coercion tipe data akan berubah otomatis menjadi integer
      System.out.println(output2);
      // gagal
      System.out.println(output3);
      // berhasil dikarenakan dilakukan casting untuk mengubah tipe data dari angka menjadi char (karakter) sehingga tipe data akan diubah secara paksa
      System.out.println(output4);
      // berhasil dikarenakan sama seperti mengubah ke integer

    }

}
