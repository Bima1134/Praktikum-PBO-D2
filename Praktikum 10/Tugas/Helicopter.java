// Helicopter.java
public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter() {
        super();
    }
    
    public Helicopter(double maxLoad) {
        super(maxLoad);
    }

    public double calcFuelEfficiency() {
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }

    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}