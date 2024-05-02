/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas Stack Of Point
 * Tanggal dibuat : 27 Maret 2024
 */

package list;
public class StackOfPoints extends Stack{
    //Konstruktor
    public StackOfPoints(){
        super();
    }
    
    //method
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    public void cetak(){// sama seperti QueueOFPoints
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    public Point getElmt(int i){
       return (Point)super.getElmt(i);// casting menjadi Point
    }
    
    public Point getTop(){
       return (Point)super.getTop(); // casting menjadi points
    }
}
