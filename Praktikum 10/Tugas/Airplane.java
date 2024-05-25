/*
 * Nama Program : Airplane.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas abstrak untuk mendefinisikan pesawat
 */

public abstract class Airplane extends Vehicle {
    protected double maxLoad;
    
    public Airplane() {
        this.maxLoad = 0;
    }

    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}