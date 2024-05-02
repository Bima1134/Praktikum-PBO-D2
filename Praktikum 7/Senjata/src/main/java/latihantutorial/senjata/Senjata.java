/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihantutorial.senjata;

/**
 *
 * @author Bima4
 */
public class Senjata {
       public static void main(String[] args){
        testSenjata ak47 = new testSenjata("TAR");
        testSenjata m16 = new testSenjata("DOR");
        
        System.out.println("AK47 menembak 3x : "); ak47.menembak(3);
        System.out.println("M16 menembak 1x : "); m16.menembak(1);
        
        System.out.println("AK47 Menusuk: "+ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 Menusuk : "+ ak47.menusuk());

    }
}
