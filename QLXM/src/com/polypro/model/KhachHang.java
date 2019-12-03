/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class KhachHang {
    public String ma_KH;
    public String ten_KH;
    public String sdt;
    public String email;
    public String diaChi;
    public boolean gioiTinh;
    public Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String ma_KH, String ten_KH, String sdt, String email, String diaChi, boolean gioiTinh, Date ngaySinh) {
        this.ma_KH = ma_KH;
        this.ten_KH = ten_KH;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getMa_KH() {
        return ma_KH;
    }

    public void setMa_KH(String ma_KH) {
        this.ma_KH = ma_KH;
    }

    public String getTen_KH() {
        return ten_KH;
    }

    public void setTen_KH(String ten_KH) {
        this.ten_KH = ten_KH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
    
}
