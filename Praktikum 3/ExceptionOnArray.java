/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : ExceptionOnArray.java
 * Deskripsi : program penggunaan eksepsi menggunakan class library Java
 * Tanggal   : 06-03-2024
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        //
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2]=11;
            arrayInteger[4]=10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
}
