package senjataa;


public class KontrolSenjata extends Senjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        super(s.getBunyi());
        this.senjata=s;
    }
    
    public boolean isAdaPeluru(){
        return super.getPeluru() >0;
    }
    
     public void isiPeluru(int jumlah){
        this.senjata.setPeluru(jumlah);
        System.out.println("Peluru berhasil ditambah: "+jumlah);
    }
    
    public void menembak (int jumlah){
        System.out.println("Siap menembak "+jumlah+" kali");
        if (senjata.getPeluru()>0){
            for(int i = 0; i<jumlah;i++){
                if(senjata.getPeluru()>0){
                    System.out.println(senjata.getBunyi()+ " ");
                }
                else{
                    System.out.println("Gagal tembak,peluru habis");
                }
                this.senjata.setPeluru(senjata.getPeluru()-1);
            }
            if (senjata.getPeluru()<0){
                senjata.setPeluru(0);
            }            
            System.out.println("Peluru sisa: "+senjata.getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb! ";
        }
        else{
            return " Gagal, belum pasang bayonet";
        }
    }
}