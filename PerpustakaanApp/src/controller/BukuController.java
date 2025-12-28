/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import config.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author SMART PC
 */
public class BukuController {
    public void simpan(String judul, String penulis, String penerbit, int tahun, int stok) {
        try {
            String sql = "INSERT INTO buku VALUES (null,?,?,?,?,?)";
            Connection conn = KoneksiDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, judul);
            ps.setString(2, penulis);
            ps.setString(3, penerbit);
            ps.setInt(4, tahun);
            ps.setInt(5, stok);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Gagal simpan buku: " + e.getMessage());
        }
    }
    
}
