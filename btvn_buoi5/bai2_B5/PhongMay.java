/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_B5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class PhongMay {
    String maPhong, tenPhong;
    double dienTich;
    Quanly x;
    ArrayList<May> y;
    int n;

    public PhongMay() {
        x = new Quanly();
        y = new ArrayList<>();
    }
    
    public void addMay(May t){
        t.nhap();
        y.add(t);
    }
    public void xuatMay(){
        for(May a: y){
            a.xuat();
        }
    }
    public void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = in.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = in.nextLine();                
        System.out.println("Nhap dien tich phong: ");
        dienTich = Double.parseDouble(in.nextLine());
        x.nhap();
        System.out.println("So may trong phong: ");
        n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++)
        {
            May temp = new May();
            addMay(temp);
        }
    }
    public void xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich phong: " +dienTich);
        System.out.println("So may tinh trong phong: " + n);
        x.xuat();
        System.out.println("Danh sach may trong phong " + tenPhong);
        xuatMay();
    }
}
