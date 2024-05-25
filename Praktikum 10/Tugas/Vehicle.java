/*
 * Nama Program : Vehicle.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas abstrak untuk mendefinisikan kendaraan
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
