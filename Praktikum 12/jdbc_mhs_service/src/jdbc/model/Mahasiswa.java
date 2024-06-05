/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Bima4
 */
public class Mahasiswa {
    // atribute
    private int id;
    private String nama;
    
    // konstruktor
    public Mahasiswa(){
        
    }
    
    public Mahasiswa (int id, String nama){
        this.id =id;
        this.nama = nama; 
    }
    
    //getter dan setter
    public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa {" +"id=" +id + "nama = " + nama +"}";
    }
}
