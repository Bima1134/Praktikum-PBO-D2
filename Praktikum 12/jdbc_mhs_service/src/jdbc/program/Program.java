/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;


import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;



/**
 *
 * @author Bima4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        // TODO code application logic here
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        Mahasiswa mhs1 = new Mahasiswa(1,"Bima");
        Mahasiswa mhs2 = new Mahasiswa(2,"Adir");
        Mahasiswa mhs3 = new Mahasiswa(3,"Cup");
        Mahasiswa mhs4 = new Mahasiswa(4,"zIKIR");
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");


        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getByID(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        System.out.println("===delete");
        System.out.println("akan di delete :" + service.getByID(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
        System.out.println();
    }
    
}
