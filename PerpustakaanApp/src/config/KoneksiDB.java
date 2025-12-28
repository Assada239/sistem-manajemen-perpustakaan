/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author SMART PC
 */
public class KoneksiDB {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                String url = "jdbc:sqlite:perpustakaan.db";
                conn = DriverManager.getConnection(url);
                System.out.println("Koneksi berhasil");
            }
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
    
}
