/*
 * Nama Program : SeaPlane.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas untuk mendefinisikan pesawat laut (amfibi)
 */

public class SeaPlane extends Airplane {

    public SeaPlane() {
        super();
    }

    public SeaPlane(double maxLoad) {
        super(maxLoad);
    }

    public double calcFuelEfficiency() {
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }

    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}