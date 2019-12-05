/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display;

import com.polypro.dao.NhanVienDAO;
import com.polypro.helper.DateHelper;
import com.polypro.helper.DialogHelper;
import com.polypro.helper.ShareHelper;
import com.polypro.model.NhanVien;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);// center in the screen   
        this.setTitle("Quản lý nhân viên");
        this.setDefaultCloseOperation(2);
        this.load();
//       BufferedImage wPic = ImageIO.read(this.getClass().getResource("Hinh/anh1.jpg"));
  //      lblHinh = new JLabel(new ImageIcon(wPic));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rdonhanvien = new javax.swing.JRadioButton();
        rdoquanly = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        txtSDT = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        lblHinh = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Hình 3x4");

        jLabel4.setText("Mã Nhân Viên");

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        jLabel5.setText("Họ Và Tên");

        jLabel6.setText("Mật Khẩu");

        jLabel7.setText("SDT");

        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setText("Mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Vai Trò");

        buttonGroup1.add(rdonhanvien);
        rdonhanvien.setText("Nhân Viên");

        buttonGroup1.add(rdoquanly);
        rdoquanly.setSelected(true);
        rdoquanly.setText("Quản Lý");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Địa chỉ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Ngày sinh");

        jLabel11.setText("Giới tính:");

        buttonGroup2.add(rdbNam);
        rdbNam.setSelected(true);
        rdbNam.setText("Nam");

        buttonGroup2.add(rdbNu);
        rdbNu.setText("Nu");

        lblHinh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rdoquanly)
                .addGap(18, 18, 18)
                .addComponent(rdonhanvien)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaNV)
                                            .addComponent(txtTen)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5))
                                                .addGap(0, 143, Short.MAX_VALUE))
                                            .addComponent(txtSDT)
                                            .addComponent(txtPass))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel10)
                                                                .addComponent(jLabel11)
                                                                .addComponent(jLabel8)
                                                                .addComponent(jLabel3))
                                                            .addGap(111, 111, 111))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(rdbNam)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(rdbNu)
                                                            .addGap(64, 64, 64)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFirst)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPrev)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNext)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLast)))
                                .addGap(83, 83, 83))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rdoquanly)
                            .addComponent(rdonhanvien)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPass)
                                .addGap(4, 4, 4)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbNam)
                            .addComponent(rdbNu)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton4)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(58, 58, 58))
        );

        tabs.addTab("CẬP NHẬP", jPanel2);

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma NV", "Ten NV", "Mat Khau", "SDT", "Email", "DiaChi", "GioiTinh", "NgaySinh", "VaiTro", "Hinh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQLNV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        tabs.addTab("DANH SÁCH", jPanel1);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
     insert();

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
      clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        index=0;
        edit();
   
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
      index--;
      edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        index++;
        edit();
  
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        index=tblQLNV.getRowCount()-1;
        edit();
        
 
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount()==2)
        {
             this.index=tblQLNV.rowAtPoint(evt.getPoint());
             if(index>=0)
             {
                this.edit();
                tabs.setSelectedIndex(0);
             }
        }
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
      try{
//        JFileChooser file = new JFileChooser();
//        int kq = file.showOpenDialog(file);
//        imageName = file.getSelectedFile().getName();
//        ResizeImage(imageName);
        JFileChooser file = new JFileChooser("Hinh\\anh1\\");
        int kq = file.showOpenDialog(file);
        if (kq == JFileChooser.APPROVE_OPTION) {
            imageName = file.getSelectedFile().getName();
            ResizeImage(imageName);
            lblHinh.setToolTipText(imageName);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh...");
        }
        
        }catch(Exception a){
            
        }
    }//GEN-LAST:event_lblHinhMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyNhanVien().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JRadioButton rdonhanvien;
    private javax.swing.JRadioButton rdoquanly;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao=new NhanVienDAO();
    int index=0;
    String imageName = null;
    
   void load()
    {
        DefaultTableModel model=(DefaultTableModel) tblQLNV.getModel();
        model.setRowCount(0);
        try{
            List<NhanVien> list= dao.select();
            for(NhanVien nv: list)
            {
                Object[] row={
               nv.getId_NV(),
               nv.getTen_NV(),
               nv.getPass(),
               nv.getSdt(),
               nv.getEmail(),
               nv.getDiaChi(),
               nv.getGioiTinh()?"Nam":"Nu",
               DateHelper.toString(nv.getNgaySinh()),
               nv.getVaiTro()?"Quản Lý":"Nhân Viên",
               nv.getHinh()
                       };
                model.addRow(row);
            }
            
        
        }
        catch(Exception ex)
        {
            DialogHelper.alert(this,"Lỗi truy vấn dữ liệu");
        }
        
    }
    
      NhanVien getModel()
    {
       
       String id_KH=txtMaNV.getText();
       String tenKH=txtTen.getText();
       String pass=txtPass.getText();
       String sdt=txtSDT.getText();
       String email=txtEmail.getText();
       String diaChi=txtDiaChi.getText();
       boolean gt;
       if(rdbNam.isSelected())  
       {
         gt=true;
       }
       else{
         gt=false;
       }
        Date ngaySinh=DateHelper.toDate(txtNgaySinh.getText());
         boolean vt;
       if(rdoquanly.isSelected())  
       {
         vt=true;
       }
       else{
         vt=false;
       }
        
       String hinh=lblHinh.getToolTipText();
       NhanVien model=new NhanVien(id_KH, tenKH, pass, sdt, email, diaChi, gt, ngaySinh, vt, hinh);
       return model;
    }
    
    void setModel(NhanVien model)
    {
        txtMaNV.setText(model.getId_NV());
        txtTen.setText(model.getTen_NV());
        txtPass.setText(model.getPass());
        txtSDT.setText(model.getSdt());
        txtEmail.setText(model.getEmail());
        txtDiaChi.setText(model.getDiaChi());
        txtNgaySinh.setText(DateHelper.toString(model.getNgaySinh()));
        lblHinh.setToolTipText(model.getHinh());
        boolean gt=model.getGioiTinh();
        if(gt==true)
        {
           rdbNam.setSelected(true);
        }
        
        if(gt==false)
        {
           rdbNu.setSelected(true);
        }
        
        boolean vt=model.getVaiTro();
        if(vt==true)
        {
           rdoquanly.setSelected(true);
        }
        
        if(vt==false)
        {
           rdonhanvien.setSelected(true);
        }
        
        
    }
    
     void setStatus(boolean insertable){
        //txtMaNV.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblQLNV.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }
     
      void clear(){
        this.setModel(new NhanVien());
        this.setStatus(true);
    }
    
    void insert()
    {
        NhanVien sp= getModel();
        try{
            dao.insert(sp);
            this.load();
            this.clear();
             DialogHelper.alert(this,"Thêm thành công");
        }
        catch(Exception ex)
        {
          DialogHelper.alert(this,"Thêm thất bại");
        }
    
    }
    
    void update()
    {
        NhanVien sp=getModel();
        try{
            dao.update(sp);
            this.load();
            this.clear();
            DialogHelper.alert(this,"Cập nhật thành công ");
        }
        catch(Exception ex)
        {
           DialogHelper.alert(this,"Cập nhật thất bại");
        }
    }
    
    void delete()
    {   String maSP=txtMaNV.getText();
        try{
            dao.delete(maSP);
            this.load();
            this.clear();
            DialogHelper.alert(this,"Xóa thành công ");
        }
        catch(Exception ex)
        {
           DialogHelper.alert(this,"Xóa thất bại");
        }
     
    }
    
    void edit()
    {
       try{
          String id=(String) tblQLNV.getValueAt(this.index, 0);
         NhanVien model= dao.findById(id);
         if(model!=null)
         {
            this.setModel(model);
            this.setStatus(false);
         }
       
       }
       catch(Exception ex)
       {
           DialogHelper.alert(this,"Lỗi truy vấn dữ liệu ");
       }
    }
    
     void selectImage()
    {
       if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
       {
          File file=fileChooser.getSelectedFile();
        
        
          
       }
       
      
    
    }
     
      public void ResizeImage(String imageName) {
        ImageIcon icon = new ImageIcon("src\\image\\" + imageName);
        Image image = icon.getImage();
        ImageIcon icon1 = new ImageIcon(image.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), image.SCALE_SMOOTH));
        lblHinh.setIcon(icon1);
        
    }

}
