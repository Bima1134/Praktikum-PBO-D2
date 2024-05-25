/*
 * Nama Program : Truck.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas untuk mendefinisikan truk
 */

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad=0;
    }
    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }

    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
