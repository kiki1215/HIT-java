/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_TLB4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
         Method.fakeData(a);
        int choice;
        while(true){
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Sap xep sinh vien theo tuoi");
            System.out.println("4. Sap xep sinh vien theo GPA");
            System.out.println("5. Sap xep sinh vien theo so tiet nghi");
            System.out.println("6. Xoa sinh vien khoi danh sach");
            System.out.println("7. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1 -> {
                    Method.themSV(a, in);
                }
                case 2 ->{
                    Method.Fixin4(a, in);
                }
                case 3 -> {
                    Method.sortAge(a, in);
                }
                case 4 -> {
                    Method.sortGPA(a, in);
                }
                case 5 -> {
                    Method.sortSTN(a, in);
                }
                case 6 -> {
                    Method.xoaSV(a, in);
                }
                case 7 ->{
                    return;
                }
            }
       }
    }
}
