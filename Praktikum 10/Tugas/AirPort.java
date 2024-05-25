/*
 * Nama Program : AirPort.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas untuk mendefinisikan Airport
 */

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Boleh mendarat.";
        } else {
            return "Tidak boleh mendarat.";
        }
    }
}