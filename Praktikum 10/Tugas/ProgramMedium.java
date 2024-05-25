/*
 * Nama Program : ProgramMedium.java
 * Penulis      : Bima Aditya Aryono /24060122140113
 * Deskripsi    : Program main untuk mendemonstrasikan bagaimana penggunaan kelas kelas kendaraan yang sudah dibuat
 */

import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(10000);
        System.out.println(truck);

        SeaPlane sPlane = new SeaPlane(5000);
        System.out.println(sPlane);

        Helicopter copter = new Helicopter(3000);
        System.out.println(copter);

        System.out.println("###########################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);

        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("###########################################");

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>(new ArrayList<>());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());

        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());

        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());
    }
}
