/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jurusan;
import Model.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    
    //INSERT Data Jurusan Baru
    public static boolean insertDataJurusanBaru(Jurusan jurusan){
        conn.connect();
        String query = "INSERT INTO jurusan(kode, nama) VALUES (?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama());
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    //Insert Data Mahasiswa Baru
    /*public static boolean insertDataMahasiswaBaru(Mahasiswa mahasiswa){
        conn.connect();
        String query = "INSERT INTO mahasiswa(nim, nama, angkatan, kode_jurusan) VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, mahasiswa.);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }*/
}
