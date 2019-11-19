/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.model;

/**
 *
 * @author HP
 */
public class SanPham {
    public String id_SP;
    public String ten_SP;
    public String id_NCC;
    public String id_loai;
    public int donGia;
    public int soLuong;

    public SanPham() {
    }

    public SanPham(String id_SP, String ten_SP, String id_NCC, String id_loai, int donGia, int soLuong) {
        this.id_SP = id_SP;
        this.ten_SP = ten_SP;
        this.id_NCC = id_NCC;
        this.id_loai = id_loai;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getId_SP() {
        return id_SP;
    }

    public void setId_SP(String id_SP) {
        this.id_SP = id_SP;
    }

    public String getTen_SP() {
        return ten_SP;
    }

    public void setTen_SP(String ten_SP) {
        this.ten_SP = ten_SP;
    }

    public String getId_NCC() {
        return id_NCC;
    }

    public void setId_NCC(String id_NCC) {
        this.id_NCC = id_NCC;
    }

    public String getId_loai() {
        return id_loai;
    }

    public void setId_loai(String id_loai) {
        this.id_loai = id_loai;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

   
    
    
}
