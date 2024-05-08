/*
 * Nama : Bima Aditya Aryono
 * File : MapTest.java
 * Deskripsi : program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */
import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map <Integer, String> map = new HashMap<Integer,String>();
        // menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2,"dua");
        map.put(1000,"seribu");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        for (Integer i : key){
            System.out.println(i+" "+map.get(i));
        }
    }
}
