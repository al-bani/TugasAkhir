/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.ProdukInterface;
import Pojo.Produk;
import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alzildan
 */
public class ProdukController implements ProdukInterface {
    private ConnectionManager conMan;
    private Connection conn;
    Statement state;
    ResultSet rs;

    @Override
    public List<Produk> findAll(String query) {
        List<Produk> listDokter = new ArrayList<>();
     
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(query);
            
            while (rs.next()) {                
                Produk prod = new Produk();
                prod.setKode(rs.getString("kode_produk"));
                prod.setNama(rs.getString("nama_produk"));
                prod.setPengiriman(rs.getString("pengiriman"));
                prod.setDeskripsi(rs.getString("deskripsi_produk"));
                prod.setPembayaran(rs.getString("metode_pembayaran"));
                prod.setHarga(rs.getDouble("harga_produk"));
                prod.setStok(rs.getInt("stok_produk"));
                prod.setBerat(rs.getInt("berat_produk"));
                prod.setKategori(rs.getString("kategori_produk"));
                
                listDokter.add(prod);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listDokter;
    }

    @Override
    public Integer create(Produk prod) {
        int result = 0;
        String sql = "INSERT INTO tb_produk "
                + "(kode_produk, nama_produk, harga_produk, deskripsi_produk, "
                + "stok_produk, pengiriman, metode_pembayaran, berat_produk, kategori_produk, produk_image) "
                + "VALUES ('"+prod.getKode()+"','"+prod.getNama()+"','"+prod.getHarga()+"','"+prod.getDeskripsi()+"',"
                + "'"+prod.getStok()+"','"+prod.getPengiriman()+"','"+prod.getPembayaran()+"','"+prod.getBerat()+"',"
                + "'"+prod.getKategori()+"','"+prod.getImage()+"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            state.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;  
    }

    @Override
    public Integer update(Produk obj) {
     int result = 0;
        String query = "UPDATE tb_produk SET "
                + "nama_produk = '"+obj.getNama()+"', harga_produk = '"+obj.getHarga()+"', "
                + "deskripsi_produk = '"+obj.getDeskripsi()+"', stok_produk = '"+obj.getStok()+"', pengiriman = '"+obj.getPengiriman()+"', "
                + "metode_pembayaran = '"+obj.getPembayaran()+"', berat_produk = '"+obj.getBerat()+"', kategori_produk = '"+obj.getKategori()+"', "
                + "produk_image = '"+obj.getImage()+"' WHERE kode_produk = '"+obj.getKode()+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            result = state.executeUpdate(query);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Produk findById(String kodeProduk) {
       Produk prod = null;
        String sql = "SELECT * FROM tb_produk WHERE kode_produk = '"+kodeProduk+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            
            while (rs.next()) {
                prod = new Produk();
                prod.setKode(rs.getString("kode_produk"));
                prod.setNama(rs.getString("nama_produk"));
                prod.setPengiriman(rs.getString("pengiriman"));
                prod.setDeskripsi(rs.getString("deskripsi_produk"));
                prod.setPembayaran(rs.getString("metode_pembayaran"));
                prod.setHarga(rs.getDouble("harga_produk"));
                prod.setStok(rs.getInt("stok_produk"));
                prod.setBerat(rs.getInt("berat_produk"));
                prod.setKategori("kategori_produk");
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prod;
    }

    @Override
    public Integer delete(String kodeProduk) {
        int result = 0;
        String query = "DELETE FROM tb_produk WHERE kode_produk = '"+kodeProduk+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            result = state.executeUpdate(query);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public List<Produk> findAll() {
            List<Produk> listDokter = new ArrayList<>();
        String sql = "SELECT * FROM tb_produk";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            
            while (rs.next()) {                
                Produk prod = new Produk();
                prod.setKode(rs.getString("kode_produk"));
                prod.setNama(rs.getString("nama_produk"));
                prod.setPengiriman(rs.getString("pengiriman"));
                prod.setDeskripsi(rs.getString("deskripsi_produk"));
                prod.setPembayaran(rs.getString("metode_pembayaran"));
                prod.setHarga(rs.getDouble("harga_produk"));
                prod.setStok(rs.getInt("stok_produk"));
                prod.setBerat(rs.getInt("berat_produk"));
                prod.setKategori(rs.getString("kategori_produk"));
                
                listDokter.add(prod);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listDokter; }

 
    
}
