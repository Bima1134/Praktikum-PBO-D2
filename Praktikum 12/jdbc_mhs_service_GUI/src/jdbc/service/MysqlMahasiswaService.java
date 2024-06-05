/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;
/**
 *
 * @author Bima4
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // constructor
    public MysqlMahasiswaService(){
        koneksi = getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
  public void add(String nama) throws SQLException {
        String query = "INSERT INTO mahasiswa (nama) VALUES('"+nama+"')";
        try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("Berhasil insert");
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs){
        
        String query = "UPDATE mahasiswa SET nama='" + mhs.getNama() + "' WHERE id=" + mhs.getID();
        try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("Berhasil update");
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }
    
    public void delete (int id){
        String query = "DELETE FROM mahasiswa WHERE id=" + id;
        try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("Berhasil delete");
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }
    
    public Mahasiswa getByID(int id){
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id=" + id;
        try {
          Statement s = koneksi.createStatement();
          ResultSet rs = s.executeQuery(query);
          if (rs.next()) {
            mhs.setID(rs.getInt("id"));
            mhs.setNama(rs.getString("nama"));
          }
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        return mhs;
    }
    
    public List<Mahasiswa> getAll()  {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
          Statement s = koneksi.createStatement();
          ResultSet rs = s.executeQuery(query);
          while (rs.next()) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setID(rs.getInt("id"));
            mhs.setNama(rs.getString("nama"));
            mahasiswaList.add(mhs);
          }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return mahasiswaList;
  }
    public void indexReset() throws SQLException {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        
        try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("Berhasil reset index");
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }
    
    public boolean isEmpty() throws SQLException {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        }
        catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        return false;
    }
    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
