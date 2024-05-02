/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas StackOfNumnber
 * Tanggal dibuat : 27 Maret 2024
 */
package list;

public class StackOfNumber extends Stack {
    //constructor
    public StackOfNumber(){
        super();
   }
    
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Integer);
    }
}
