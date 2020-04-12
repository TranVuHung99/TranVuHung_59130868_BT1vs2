/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuoctinh;

/**
 *
 * @author KimKhanh
 */
public class Nhanvien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int giolam;
    public Nhanvien(){
      }
    public Nhanvien(String ten, int tuoi, String diachi, double tienluong, int giolam){
    this.ten = ten;
    this.tuoi = tuoi;
    this.diachi = diachi;
    this.tienluong = tienluong;
    this.giolam = giolam;
    }
    public void setTen(String ten){
    this.ten = ten;
    }
    public void setTuoi(int tuoi){
    this.tuoi = tuoi;
    }
    public void setDiachi(String diachi){
    this.diachi = diachi;
    }
    public void setTienluong(double tienluong){
    this.tienluong = tienluong;
    }
    public void setGiolam(int giolam){
    this.giolam = giolam;
    }
    public double tienthuong(){
    if (giolam >= 200) return tienluong*0.2;
    else if(giolam >= 100) return tienluong*0.1;
            else return 0;}
    public String getThongtin(){
    return "Ten: " +ten+"\tTuoi: "+tuoi+"\tDiaChi: "+diachi+"\tTienLuong: "+tienluong+"\tGioLam: "+giolam+"\tTienThuong: "+tienthuong()+".";
    }
}
    
