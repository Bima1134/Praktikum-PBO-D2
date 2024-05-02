/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas Abstrak Queue
 * Tanggal dibuat : 27 Maret 2024
 */
package list;
public abstract class Queue extends List {
    //Konstruktor
    public Queue(){
        super();
    }
    // selektor
    // mendapatkan nilai dari head baik Point maupun Integer
    public Object getHead(){
        return getElmt(0);
    }
    // mendapatkan nilai dari tail baik Point maupun Integer
    public Object getTail(){
        return getElmt(getSize()-1);
    }
    // penerapan fungsi abstrak pada Queue   
    public void del(){
        list.removeFirst();
    }
    // Penerapan fungsi cetak pada Queue
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            System.out.println(getElmt(i));
        }
    }
}