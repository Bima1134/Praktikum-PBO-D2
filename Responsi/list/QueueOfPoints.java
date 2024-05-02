/*
 * NIM / NAMA Pembuat : 24060122140113 / Bima Aditya Aryono
 * Deskripsi : Kelas QueueOfPoints
 * Tanggal dibuat : 27 Maret 2024
 */
package list;

public class QueueOfPoints extends Queue {
    //constructor
    public QueueOfPoints(){
        super();
    }
    
    //method
    // boolean ngecek apakah inputan point
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    

    // selektor
    public Point getElmt(int i){
       return (Point)super.getElmt(i);
    }
    

    public Point getHead(){
       return (Point)super.getHead();
    }
    
    public Point getTail(){
       return (Point)super.getTail();
    }

    // prosedur
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            if(getElmt(i) instanceof Point P){
                P.cetak();
            }
        }
    }
}
