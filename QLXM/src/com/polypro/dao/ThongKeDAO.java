/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.dao;

import com.polypro.helper.JdbcHelper; 
import com.polypro.model.ThongKe;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 


public class ThongKeDAO {
    
      public List<Object[]> getDanhSachTheoNgay(){         
          List<Object[]> list=new ArrayList<>();
              try {             
                  ResultSet rs = null;
                 try {                 
            String sql="{call tkhoadontheongay{?,?}}";
                                            
                          rs = JdbcHelper.executeQuery(sql); 
      while(rs.next()){                     
          Object[] model={                         
              rs.getDate("NgayBan"),                        
              rs.getInt("SoLuongHoaDon"),                         
              rs.getInt("DoanhThu"),                                             
          };                     
          list.add(model);                 
      }             
              }              
              finally{                 
                  rs.getStatement().getConnection().close();
              }         
      }          
catch (SQLException ex) {             
    //throw new RuntimeException(ex);     
    ex.printStackTrace();
}         
return list;
} 
      
       public List<Object[]> getDanhSachTheoNam(ThongKe danhsach){         
          List<Object[]> list=new ArrayList<>();
              try {             
                  ResultSet rs = null;
                 try {                 
            String sql="{call tkhoadontheoNam{?,?}}";
                                       
                          rs= JdbcHelper.executeQuery(sql,
                                  danhsach.getNgaybatdau(),
                                  danhsach.getNgayketthuc()
                                  
                                  ); 
      while(rs.next()){                     
          Object[] model={                         
              rs.getDate("NgayBan"),                        
              rs.getInt("SoLuongHoaDon"),                         
              rs.getInt("DoanhThu"),                                             
          };                     
          list.add(model);                 
      }             
              }              
              finally{                 
                  rs.getStatement().getConnection().close();
              }         
      }          
catch (SQLException ex) {             
    //throw new RuntimeException(ex);     
    ex.printStackTrace();
}         
return list;
} 
       
        public List<Object[]> getDoanhThuTheoNam(){         
          List<Object[]> list=new ArrayList<>();
              try {             
                  ResultSet rs = null;
                 try {                 
            String sql="{call tkdoanhthutheonam}";
                                            
                          rs = JdbcHelper.executeQuery(sql); 
      while(rs.next()){                     
          Object[] model={                         
              rs.getInt("DoanhThu"),                        
                                             
          };                     
          list.add(model);                 
      }             
              }              
              finally{                 
                  rs.getStatement().getConnection().close();
              }             
      }          
catch (SQLException ex) {             
    //throw new RuntimeException(ex);     
    ex.printStackTrace();
}         
return list;
} 
        
        public List<Object[]> getDoanhThuTheoThang(){         
          List<Object[]> list=new ArrayList<>();
              try {             
                  ResultSet rs = null;
                 try {                 
            String sql="{call tkdoanhthutheothang}";
                                            
                          rs = JdbcHelper.executeQuery(sql); 
      while(rs.next()){                     
          Object[] model={                         
              rs.getInt("DoanhThu"),                        
                                             
          };                     
          list.add(model);                 
      }             
              }              
              finally{                 
                  rs.getStatement().getConnection().close();
              }             
      }          
catch (SQLException ex) {             
    //throw new RuntimeException(ex);     
    ex.printStackTrace();
}         
return list;
} 
           
   } 

  
                     
