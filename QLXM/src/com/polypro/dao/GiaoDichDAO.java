/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;

import com.polypro.helper.DateHelper;
import com.polypro.helper.JdbcHelper;
import com.polypro.model.GiaoDich;
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
        String sql="select GiaoDich.id_GD,ten_KH,ten_NV,NgayBan,DonGia,SoLuong,ThanhTien from GiaoDich inner join CTGD on GiaoDich.id_GD=CTGD.id_GD inner join KhachHang on GiaoDich.id_KH=KhachHang.id_KH inner join NhanVien on NhanVien.id_NV=GiaoDich.id_NV";
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
        GiaoDich model=new GiaoDich();
        model.setMaGD(rs.getString("id_GD"));
        model.setTen_KH(rs.getString("ten_KH"));
        model.setTen_NV(rs.getString("ten_NV"));
        model.setNgayBan(rs.getDate("NgayBan"));
        model.setDonGia(rs.getInt("DonGia"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setThanhTien(rs.getInt("ThanhTien"));
      
        
        return model;
    }
   /* 
     public void insert(GiaoDich model){
        String sql="INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, 
                model.getMaGD(), 
                model.getTen_KH(), 
                model.getTen_NV(), 
                //model.getNgayKG(),
                DateHelper.toString(model.getNgayBan(), "yyyy-MM-dd"),
                model.getDonGia(),
                model.getSoLuong(),
                model.getThanhTien()
        
        );
    }
    
    public void update(GiaoDich model){
        String sql="UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
        JdbcHelper.executeUpdate(sql, 
                model.getMaCD(), 
                model.getHocPhi(), 
                model.getThoiLuong(), 
                //model.getNgayKG(),
                DateHelper.toString(model.getNgayKG(), "yyyy-MM-dd"),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH());
    }
    
    public void delete(Integer MaKH){
        String sql="DELETE FROM KhoaHoc WHERE MaKH=?";
        JdbcHelper.executeUpdate(sql, MaKH);
    }*/
}
