/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;

import com.polypro.helper.DateHelper;
import com.polypro.helper.JdbcHelper;
import com.polypro.model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class KhachHangDAO {
    public void insert(KhachHang model){         
       String sql="INSERT INTO KhachHang (id_KH, ten_KH, SDT, Email, DiaChi, GioiTinh,NgaySinh) VALUES (?, ?, ?, ?, ?, ?,?)";         
       JdbcHelper.executeUpdate(sql,                  
               model.getMa_KH(),                  
               model.getTen_KH(),                  
               model.getSdt(),                  
               model.getEmail(),                 
               model.getDiaChi(),                 
               model.getGioiTinh(),
               //model.getNgaySinh()
               DateHelper.toString(model.getNgaySinh(),"yyyy-MM-dd")
       );     
   }  
    public void update(KhachHang model){         
        String sql="UPDATE KhachHang SET ten_KH=?, SDT=?, Email=?, DiaChi=?, GioiTinh=?, NgaySinh=? WHERE id_KH=?";         
    JdbcHelper.executeUpdate(sql,                  
            model.getTen_KH(),                  
            
            model.getSdt(),                  
            model.getEmail(),                 
            model.getDiaChi(),                 
            model.getGioiTinh(),                 
           // model.getNgaySinh(),
            DateHelper.toString(model.getNgaySinh(),"yyyy-MM-dd"),
            model.getMa_KH());     
    }    
     public void delete(String id){        
         String sql="DELETE FROM KhachHang WHERE id_KH=?";         
         JdbcHelper.executeUpdate(sql, id);
     }   
     
      public List<KhachHang> select(){         
         String sql="SELECT * FROM KhachHang";         
         return select(sql);    
     }  
     
        public List<KhachHang> selectByKeyword(String keyword){         
            String sql="SELECT * FROM KhachHang WHERE ten_KH LIKE ?";         
            return select(sql, "%"+keyword+"%");
        }     
        
          private List<KhachHang> select(String sql, Object...args){         
        List<KhachHang> list=new ArrayList<>();
            try {             ResultSet rs = null;             
            try {                 rs = JdbcHelper.executeQuery(sql, args);
                             
            while(rs.next()){                     
                KhachHang model=readFromResultSet(rs);
                                 
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
        
      public KhachHang findById(String maSP){         
          String sql="SELECT * FROM KhachHang WHERE id_KH=?";         
          List<KhachHang> list = select(sql, maSP);         
          return list.size() > 0 ? list.get(0) : null;
      }   
  
      private KhachHang readFromResultSet(ResultSet rs) throws SQLException{         
          KhachHang model=new KhachHang();         
          model.setMa_KH(rs.getString("id_KH"));         
          model.setTen_KH(rs.getString("ten_KH"));         
          model.setSdt(rs.getString("SDT"));          
          model.setEmail(rs.getString("Email"));         
          model.setDiaChi(rs.getString("DiaChi"));         
          model.setGioiTinh(rs.getBoolean("GioiTinh"));  
          model.setNgaySinh(rs.getDate("NgaySinh"));
          return model;     }
}
