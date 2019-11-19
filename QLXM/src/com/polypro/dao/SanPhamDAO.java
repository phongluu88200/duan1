/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;

import com.polypro.helper.JdbcHelper;
import com.polypro.model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class SanPhamDAO {
     public void insert(SanPham model){         
       String sql="INSERT INTO SanPham (id_SP, ten_SP, id_NCC, id_Loai, DonGia, SoLuong) VALUES (?, ?, ?, ?, ?, ?)";         
       JdbcHelper.executeUpdate(sql,                  
               model.getId_SP(),                  
               model.getTen_SP(),                  
               model.getId_NCC(),                  
               model.getId_loai(),                 
               model.getDonGia(),                 
               model.getSoLuong());     
   }  
    public void update(SanPham model){         
        String sql="UPDATE SanPham SET ten_SP=?, id_NCC=?, id_Loai=?, DonGia=?, SoLuong=? WHERE id_SP=?";         
    JdbcHelper.executeUpdate(sql,                  
            model.getTen_SP(),                  
            
            model.getId_NCC(),                  
            model.getId_loai(),                 
            model.getDonGia(),                 
            model.getSoLuong(),                 
                           
            model.getId_SP());     
    }    
     public void delete(String id){        
         String sql="DELETE FROM SanPham WHERE id_SP=?";         
         JdbcHelper.executeUpdate(sql, id);
     }   
     
      public List<SanPham> select(){         
         String sql="SELECT * FROM SanPham";         
         return select(sql);    
     }  
     
        public List<SanPham> selectByKeyword(String keyword){         
            String sql="SELECT * FROM SanPham WHERE ten_SP LIKE ?";         
            return select(sql, "%"+keyword+"%");
        }     
        
          private List<SanPham> select(String sql, Object...args){         
        List<SanPham> list=new ArrayList<>();
            try {             ResultSet rs = null;             
            try {                 rs = JdbcHelper.executeQuery(sql, args);
                             
            while(rs.next()){                     
                SanPham model=readFromResultSet(rs);
                                 
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
      public SanPham findById(String maSP){         
          String sql="SELECT * FROM SanPham WHERE id_SP=?";         
          List<SanPham> list = select(sql, maSP);         
          return list.size() > 0 ? list.get(0) : null;
      }   
  
      private SanPham readFromResultSet(ResultSet rs) throws SQLException{         
          SanPham model=new SanPham();         
          model.setId_SP(rs.getString("id_SP"));         
          model.setTen_SP(rs.getString("ten_SP"));         
          model.setId_NCC(rs.getString("id_NCC"));          
          model.setId_loai(rs.getString("id_Loai"));         
          model.setDonGia(rs.getInt("DonGia"));         
          model.setSoLuong(rs.getInt("SoLuong"));         
          return model;     }

}
