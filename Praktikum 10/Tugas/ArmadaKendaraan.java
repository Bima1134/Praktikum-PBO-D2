/*
 * Nama Program : ArmadaKendaraan.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Kelas untuk mendefinisikan armada kendaraan
 */


import java.util.Collection;

class ArmadaKendaraan<T extends Vehicle> {
    private Collection<T> kendaraan;

    public ArmadaKendaraan(Collection<T> kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void tambahArmada(Collection<? extends T> armadaBaru) {
        kendaraan.addAll(armadaBaru);
    }

    public int getAllArmada() {
        return kendaraan.size();
    }
}
