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
public class Student {
    String name, lop;
    double score;
    Faculty y;

    public Student() {
        y = new Faculty();
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        name = in.nextLine();
        System.out.println("Nhap ten lop: ");
        lop= in.nextLine();
        System.out.println("Nhap diem so: ");
        score = Integer.parseInt(in.nextLine());
        y.input();
    }
    public void output(){
        System.out.println("Ten sinh vien: "+ name);
        System.out.println("Ten lop: " + lop);
        System.out.println("Diem: " +score);
        y.output();
    }
}
