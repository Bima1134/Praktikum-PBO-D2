/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas Abstrak List
 * Tanggal dibuat : 27 Maret 2024
 */
package list;

import java.util.ArrayList;


public abstract class List {
    //atribut
    protected ArrayList<Object> list;
    
    //Konstruktor
    List(){
        list = new ArrayList<>();
    }
    
    //method
    // mendapatkan size
    public int getSize(){
        return list.size();
    }
    // mendapatkan element ke (i)
    public Object getElmt(int i){
        return list.get(i);
    }
    // Kelas abstrak untuk melakukan pengecekan pada elemen yang akan diinputkan
    public abstract boolean cekElmtType(Object elmt);
    // Prosedur menambahkan apakah 
    public void add(Object elmt) throws Exception{
        list.addLast(elmt);
    }
    // prosdur abstrak untuk melakukan penghapusan pada elemen
    public abstract void del();
    // prosedur abstrak untuk melakukan pencetakan
    public abstract void cetak();
}
