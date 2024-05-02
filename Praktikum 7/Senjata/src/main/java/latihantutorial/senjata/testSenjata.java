package latihantutorial.senjata;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bima4
 */


public class testSenjata {
    private String bunyi;
    private boolean menusuk;
    
    public testSenjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk= false;
    }
    private String getBunyi(){
        return bunyi;
    }
    
    private void setBunyi(){
        this.bunyi = bunyi;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void menembak (int jumlah){
        for(int i = 0; i<jumlah;i++){
            System.out.println(getBunyi()+ " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb! ";
        }
        else{
            return " Gagal, belum pasang bayonet";
        }
    }
    
}
