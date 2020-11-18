/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Mahasiswa{
    private String nim;
    private String nama_mhs;
    private int angkatan;
    private String kode_jurusan;
    
    public Mahasiswa(String nim, String nama_mhs, int angkatan, String kode_jurusan){
        this.nim = nim;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
        
    }
}
