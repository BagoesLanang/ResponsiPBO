package controllerpack;

import model.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class RentalController {
    
    public void tambahData(Rental p){
        String query = "INSERT INTO rental (nama, kontak, jenis,  durasi, total, status ) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
    PreparedStatement stmt = conn.prepareStatement(query)){
          stmt.setString(1,p.getNama());
          stmt.setString(2, p.getKontak ());
          stmt.setString(3, p.getJenisMobil());
          stmt.setInt(4, p.getDurasi());
          stmt.setInt(5, p.getTotalBiaya());
          stmt.setString(6, p.getStatus());
          stmt.executeUpdate();
        }catch (SQLException e){
            System.out.println("Gagal tambah data: " + e.getMessage());
        }                
    }
    
    public DefaultTableModel getAllData(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Nama", "Kontak", "Jenis", "Durasi", "Total", "Status"});
        
        String query = "SELECT * FROM rental";
        try (Connection conn = DBConnection.getConnection();
    Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()){
                Object[] row = new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("kontak"),
                    rs.getString("jenis"),
                    rs.getInt("durasi"),
                    rs.getInt("total"),
                    rs.getString("status")
                };
                model.addRow(row);
            }
        }catch(SQLException e){
            System.out.println("Gagal ambil data: " + e.getMessage());
        }
        
        return model;
    }
    
    public void updateData(int id, Rental p){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}