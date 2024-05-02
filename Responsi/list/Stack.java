/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas Abstrak Stack untuk Stack Of Number dan Stack Of Point
 * Tanggal dibuat : 27 Maret 2024
 */
package list;

public abstract class Stack extends List {
    //Konstruktor
    protected Stack(){
        super();
    }
    // methodd
    public Object getTop(){
        return getElmt(getSize()-1);
    }
    // penerapan fungsi abstrak del pada Stack
    public void del(){
        list.removeLast();
    }
    // penerapan fungsi asbtrak cetak pada Stack
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElmt(i));
        }
    }
}