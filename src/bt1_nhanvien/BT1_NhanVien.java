/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_nhanvien;

import IQuanly.QuanLyNhanVien;
import Thuoctinh.Nhanvien;

/**
 *
 * @author KimKhanh
 */
public class BT1_NhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien("Hùng",20,"Vĩnh Hòa",650000,200);
        System.out.println(nv1.getThongtin());
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        Nhanvien nv2 = new Nhanvien("Cao",20,"Đồng Bò ",400000,150);
        Nhanvien nv3 = new Nhanvien("Lợi",20,"Đồng Đế ",420000,250);
        Nhanvien nv4 = new Nhanvien("Thịnh",20,"Vĩnh Hải ",300000,170);
        Nhanvien nv5 = new Nhanvien("Quỳnh",20,"Hòn Xện ",400000,110);
        
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
    
}
