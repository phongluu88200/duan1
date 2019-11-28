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
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class GiaoDichDAO {
     public List<GiaoDich> select(){
       
        //String sql="select HoaDon.id_HD,KhachHang.id_KH,ten_KH,NhanVien.id_NV,ten_NV,id_SP,NgayBan,DonGia,SoLuong,ThanhTien from HoaDon inner join CTHD on HoaDon.id_HD=CTHD.id_HD inner join KhachHang on HoaDon.id_KH=KhachHang.id_KH inner join NhanVien on NhanVien.id_NV=HoaDon.id_NV";
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
      
        String tenKH=rs.getString("ten_KH");
        String tenNV=rs.getString("ten_NV");
        Date ngayBan=rs.getDate("NgayBan");
        int donGia=rs.getInt("DonGia");
        int soLuong=rs.getInt("SoLuong");
        int thanhTien=rs.getInt("ThanhTien");
      
        GiaoDich model=new GiaoDich(id_MaHD, tenKH, tenNV, ngayBan, donGia, soLuong, thanhTien);
        return model;
    }
   
     public void insert(GiaoDich model){
        String sql="call sp_GD_Insert (?)";
        JdbcHelper.executeUpdate(sql, 
                model.getMaHD(), 
                model.getTen_KH(), 
                model.getTen_NV(), 
                //model.getNgayKG(),
                DateHelper.toString(model.getNgayBan(), "yyyy-MM-dd"),
                model.getDonGia(),
                model.getSoLuong(),
                model.getThanhTien()
        
        );
    }
    /*
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
     
     
      public GiaoDich findById(String maHD){         
          String sql="{call sp_GiaoDichFind(?)}";         
          List<GiaoDich> list = select(sql, maHD);         
          return list.size() > 0 ? list.get(0) : null;
      }   
}
