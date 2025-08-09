/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_B5;

import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Faculty {
    String name, date;
    School x;

    public Faculty() {
        x = new School();
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten khoa: ");
        name = in.nextLine();
        System.out.println("Nhap ngay vao khoa");
        date = in.nextLine();
        System.out.println("Nhap ten truong: ");
        x.name = in.nextLine();
        System.out.println("Nhap ngay vao truong: ");
        x.date = in.nextLine();
    }
    public void output(){
        System.out.println("Ten khoa" + name);
        System.out.println("Ngay vao khoa: " + date);
        System.out.println("Ten truong: " + x.name);
        System.out.println("Ngay vao truong: " + x.date);
   }
}
