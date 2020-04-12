/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IQuanly;

/**
 *
 * @author KimKhanh
 */
import Thuoctinh.Nhanvien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanly {
    ArrayList<Nhanvien>dsNhanvien = new ArrayList<>();
    @Override
    public void them(Nhanvien nv){
        dsNhanvien.add(nv);
    }
    @Override
    public void inDS(){
        System.out.println("Danh sach nhan vien: \n");
                for(int i=0;i<dsNhanvien.size();i++){
                    System.out.println(i+1+"."+dsNhanvien.get(i).getThongtin());
    }
    }
}
    
    
    
