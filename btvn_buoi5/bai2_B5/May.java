/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_B5;

import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class May {
    String maMay, tenMay, tinhTrang;
    public void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        maMay = in.nextLine();
        System.out.println("Nhap ten may: ");
        tenMay = in.nextLine();
        System.out.println("Nhap tinh trang may: ");
        tinhTrang = in.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may: " + maMay);
        System.out.println("Ten may: " + tenMay);
        System.out.println("Tinh trang may: " + tinhTrang);
    }
}
