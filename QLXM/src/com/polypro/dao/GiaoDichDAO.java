/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;

import com.polypro.helper.DateHelper;
import com.polypro.helper.JdbcHelper;
import com.polypro.model.GiaoDich;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author HP
 */
public class GiaoDichDAO {
  
     public List<GiaoDich> select(){
        String sql="{call sp_GiaoDich}";
        
        return select(sql);
    }
     
     private List<GiaoDich> select(String sql, Object...args){
        List<GiaoDich> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    GiaoDich model = readFromResultSet(rs);
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    private GiaoDich readFromResultSet(ResultSet rs) throws SQLException{
        String id_MaHD=rs.getString("id_HD");
        String id_KH=rs.getString("id_KH");
        String tenKH=rs.getString("ten_KH");
        String id_NV=rs.getString("id_NV");
        String tenNV=rs.getString("ten_NV");
        String id_SP=rs.getString("id_SP");
        Date ngayBan=rs.getDate("NgayBan");
        int donGia=rs.getInt("DonGia");
        int soLuong=rs.getInt("SoLuong");
        int thanhTien=rs.getInt("ThanhTien");
      
        GiaoDich model=new GiaoDich(id_MaHD, id_KH, tenKH, id_NV, tenNV, id_SP, ngayBan, donGia, soLuong, thanhTien);
        return model;
    }
   
     public void insert(GiaoDich model){
        String sql="{call sp_GD_Insert (?,?,?,?,?,?,?,?)}";
        JdbcHelper.executeUpdate(sql, 
                model.getMaHD(), 
                model.getId_KH(), 
                model.getId_NV(),
                model.getId_SP(),
                //model.getNgayKG(),
                DateHelper.toString(model.getNgayBan(), "yyyy-MM-dd"),
                model.getDonGia(),
                model.getSoLuong(),
                model.getThanhTien()
        
        );
    }
     
      public void update(GiaoDich model){
        String sql="{call sp_GD_Update (?,?,?,?,?,?,?,?)}";
        JdbcHelper.executeUpdate(sql, 
                model.getMaHD(), 
                model.getId_KH(), 
                model.getId_NV(),
                model.getId_SP(),
                //model.getNgayKG(),
                DateHelper.toString(model.getNgayBan(), "yyyy-MM-dd"),
                model.getDonGia(),
                model.getSoLuong(),
                model.getThanhTien()
        
        );
    }
    
   
    
    public void delete(String MaKH){
        String sql="{call sp_GD_Delete (?)}";
        JdbcHelper.executeUpdate(sql, MaKH);
    }
     
     
      public GiaoDich findById(String maHD){         
          String sql="{call sp_GiaoDichFind(?)}";         
          List<GiaoDich> list = select(sql, maHD);         
          return list.size() > 0 ? list.get(0) : null;
      }   
}
