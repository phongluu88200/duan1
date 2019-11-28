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
public class GiaoDich {
    public String maHD;
    public String id_KH;
    public String ten_KH;
    public String id_NV;
    public String ten_NV;
    public String id_SP;
    public Date ngayBan;
    public int DonGia;
    public int SoLuong;
    public int ThanhTien;

    public GiaoDich() {
    }

    public GiaoDich(String maHD, String id_KH, String ten_KH, String id_NV, String ten_NV, String id_SP, Date ngayBan, int DonGia, int SoLuong, int ThanhTien) {
        this.maHD = maHD;
        this.id_KH = id_KH;
        this.ten_KH = ten_KH;
        this.id_NV = id_NV;
        this.ten_NV = ten_NV;
        this.id_SP = id_SP;
        this.ngayBan = ngayBan;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public GiaoDich(String maHD, String id_KH, String id_NV, String id_SP, Date ngayBan, int DonGia, int SoLuong, int ThanhTien) {
        this.maHD = maHD;
        this.id_KH = id_KH;
        this.id_NV = id_NV;
        this.id_SP = id_SP;
        this.ngayBan = ngayBan;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }
    

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getId_KH() {
        return id_KH;
    }

    public void setId_KH(String id_KH) {
        this.id_KH = id_KH;
    }

    public String getTen_KH() {
        return ten_KH;
    }

    public void setTen_KH(String ten_KH) {
        this.ten_KH = ten_KH;
    }

    public String getId_NV() {
        return id_NV;
    }

    public void setId_NV(String id_NV) {
        this.id_NV = id_NV;
    }

    public String getTen_NV() {
        return ten_NV;
    }

    public void setTen_NV(String ten_NV) {
        this.ten_NV = ten_NV;
    }

    public String getId_SP() {
        return id_SP;
    }

    public void setId_SP(String id_SP) {
        this.id_SP = id_SP;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

   

   
    
    
}
