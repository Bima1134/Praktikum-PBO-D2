
/*
 * Nama Program : RiverBarge.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas untuk mendefinisikan RiverBarge
 */
public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge() {
        this.maxLoad = 0;
    }

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }
}