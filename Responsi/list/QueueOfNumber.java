/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas QueueOfNumber
 * Tanggal dibuat : 27 Maret 2024
 */
package list;

public class QueueOfNumber extends Queue{
    //Konstruktor
    public QueueOfNumber(){
        super();
    }
    
    //method
    // fungsi boolean mengecek apakah elemen bertipe integer
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Integer);
    }


}
