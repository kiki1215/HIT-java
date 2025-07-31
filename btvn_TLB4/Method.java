/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_TLB4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Method {
    public static void inSV(ArrayList<Student> a, Scanner in){
        Student.inTD();
        for(Student i : a){
            i.in();
        }
    }
    public static void fakeData(ArrayList<Student> a){
        Student b = new Student("Khoi", 2006, "Ha Noi", 8.0f, 8.5f, 10.0f, 2);
        Student c = new Student("Thu", 2005, "Ha Noi", 9.0f, 7.5f, 9.0f, 4);
        Student d = new Student("Khanh", 2009, "Ha Noi", 10.0f, 9.5f, 10.0f, 0);
        a.add(b);
        a.add(d);
        a.add(c);
    }
    public static void themSV(ArrayList<Student> a, Scanner in){
        System.out.print("Ban muon nhap them bao nhieu sinh vien: ");
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            System.out.println("Sinh vien them thu " + i);
            Student b = new Student();
            b.nhap(in);
            a.add(b);
        }
        inSV(a, in);
    }
    public static void Fixin4(ArrayList<Student> a, Scanner in){
        System.out.print("Nhap ten sinh vien muon sua: ");
        boolean check = false;
        String ten = in.nextLine();
        for(int i = 0; i < a.size(); i++) {
            if(ten.equalsIgnoreCase(a.get(i).getTen())){
                System.out.println("Nhap lai thong tin sinh vien: ");
                a.get(i).nhap(in);
                check = true;
            }
        }
        if(!check){
            System.out.println("Khong co ten sinh vien ban muon tim!");
        }
        else{
            System.out.println("Danh sach sau khi sua la: ");
            inSV(a,in);
        }
    }
    public static void sortAge(ArrayList<Student> a, Scanner in){
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getTuoi(),o2.getTuoi());
            }
            
        });
        System.out.println("Danh sach sinh vien sau khi sap xep tang dan theo tuoi la:" );
        inSV(a,in);
    }
    public static void sortGPA(ArrayList<Student> a, Scanner in){
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o2.getGPA(),o1.getGPA());
            }            
        });
        System.out.println("Danh sach sinh vien sau khi sap xep giam dan theo diem GPA la:" );
        inSV(a,in);
    }
    public static void sortSTN(ArrayList<Student> a, Scanner in){
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getSTN(),o1.getSTN());
            }
        });
        System.out.println("Danh sach sinh vien sau khi sap xep giam dan theo so tiet nghi la:" );
        inSV(a,in);
    }
    public static void xoaSV(ArrayList<Student> a, Scanner in){
        System.out.print("Nhap ten sinh vien ban muon xoa: ");
        boolean check = false;
        String ten = in.nextLine();
        for(int i = 0; i < a.size(); i++) {
            if(ten.equalsIgnoreCase(a.get(i).getTen())){
                a.remove(i);
                check = true;
            }
        }
        if(!check){
            System.out.println("Khong co ten sinh vien ban muon xoa!");
        }
        else{
            System.out.println("Danh sach sau khi xoa la: ");
            inSV(a,in);
        }
    }
}
