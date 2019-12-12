/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;
import  com.polypro.helper.DateHelper;
import com.polypro.helper.JdbcHelper;
import com.polypro.model.NhanVien;
import java.sql.Connection;
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
public class NhanVienDAO {
   
     public void insert(NhanVien model){         
       String sql="INSERT INTO NhanVien (id_NV, ten_NV, MatKhau ,SDT, Email, DiaChi, GioiTinh,NgaySinh, VaiTro,Hinh) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";         
       JdbcHelper.executeUpdate(sql,                  
               model.getId_NV(),                  
               model.getTen_NV(),
               model.getPass(),
               model.getSdt(),                  
               model.getEmail(),                 
               model.getDiaChi(),                 
               model.getGioiTinh(),
               //model.getNgaySinh()
               DateHelper.toString(model.getNgaySinh(),"yyyy-MM-dd"),
               model.getVaiTro(),
               model.getHinh()
       );     
   }  
    public void update(NhanVien model){         
        String sql="UPDATE NhanVien SET ten_NV=?, MatKhau=? , SDT=?, Email=?, DiaChi=?, GioiTinh=?, NgaySinh=? , VaiTro=?, Hinh=? WHERE id_NV=?";         
    JdbcHelper.executeUpdate(sql,                  
            model.getTen_NV(),                  
            model.getPass(),
            model.getSdt(),                  
            model.getEmail(),                 
            model.getDiaChi(),                 
            model.getGioiTinh(),                 
           // model.getNgaySinh(),
            DateHelper.toString(model.getNgaySinh(),"yyyy-MM-dd"),
            model.getVaiTro(),
            model.getHinh(),
            model.getId_NV());     
    }    
     public void delete(String id){        
         String sql="DELETE FROM NhanVien WHERE id_NV=?";         
         JdbcHelper.executeUpdate(sql, id);
     }   
     
      public List<NhanVien> select(){         
         String sql="SELECT * FROM NhanVien";         
         return select(sql);    
     }  
     
        public List<NhanVien> selectByKeyword(String keyword){         
            String sql="SELECT * FROM NhanVien WHERE ten_NV LIKE ?";         
            return select(sql, "%"+keyword+"%");
        }     
        
          private List<NhanVien> select(String sql, Object...args){         
        List<NhanVien> list=new ArrayList<>();
            try {             ResultSet rs = null;             
            try {                 rs = JdbcHelper.executeQuery(sql, args);
                             
            while(rs.next()){                     
                NhanVien model=readFromResultSet(rs);
                                 
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
        
      /* public List<NguoiHoc> selectByCourse(Integer makh){         
            String sql="SELECT * FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";         
            return select(sql, makh);
        }   */
      public NhanVien findById(String maSP){         
          String sql="SELECT * FROM NhanVien WHERE id_NV=?";         
          List<NhanVien> list = select(sql, maSP);         
          return list.size() > 0 ? list.get(0) : null;
      }   
       public NhanVien findById1(String user, String pass){         
          String sql="SELECT * FROM NhanVien WHERE id_NV=? and MatKhau=?";         
          List<NhanVien> list = select(sql,user,pass);         
          return list.size() > 0 ? list.get(0) : null;
      }  
      private NhanVien readFromResultSet(ResultSet rs) throws SQLException{         
          NhanVien model=new NhanVien();         
          model.setId_NV(rs.getString("id_NV"));         
          model.setTen_NV(rs.getString("ten_NV"));
          model.setPass(rs.getString("MatKhau"));
          model.setSdt(rs.getString("SDT"));          
          model.setEmail(rs.getString("Email"));         
          model.setDiaChi(rs.getString("DiaChi"));         
          model.setGioiTinh(rs.getBoolean("GioiTinh"));  
          model.setNgaySinh(rs.getDate("NgaySinh"));
          model.setVaiTro(rs.getBoolean("VaiTro"));
          model.setHinh(rs.getString("Hinh"));
          return model;     }
    
}
