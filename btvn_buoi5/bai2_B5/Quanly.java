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
public class Quanly {
    String id, hoTen;
    public void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma quan ly: ");
        id = in.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = in.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan ly: " + id);
        System.out.println("Ho ten: "+ hoTen);
    }
}
