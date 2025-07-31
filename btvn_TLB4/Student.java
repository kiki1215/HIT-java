/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_TLB4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Student {
    private String ten, diaChi;
    private int namSinh, soTietNghi;
    private float diemTX1, diemTX2, diemKTHP;
   
    public int getTuoi() {
        return LocalDate.now().getYear() - namSinh;
    }
    public float getGPA() {
        return diemTX1 * 0.2f + diemTX2 * 0.3f + diemKTHP * 0.5f;
    }
    public Student(){}
    public Student(String ten, int namSinh, String diaChi, float diemTX1, float diemTX2, float diemKTHP, int soTietNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
        this.soTietNghi = soTietNghi;
    }
    public String getTen(){
        return ten;
    }
    public int getSTN(){
        return soTietNghi;
    }
    public static void inTD(){
        System.out.printf("%-10s %-5s %-15s %-10s %-10s %-10s %-10s %-20s\n", "Ten", "Tuoi", "Dia chi", "Diem tx1", "Diem tx2", "Diem KTHP", "Diem GPA", "So tiet nghi");
    }
    public void in(){
        System.out.printf("%-10s %-5d %-15s %-10.1f %-10.1f %-10.1f %-10.1f %-15d\n", ten, getTuoi(), diaChi, diemTX1, diemTX2,diemKTHP ,getGPA(), soTietNghi);
    }
    public void nhap(Scanner in){
        System.out.print("Nhap ten: ");
        ten = in.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = Integer.parseInt(in.nextLine());
        System.out.print("Nhap dia chi: ");
        diaChi = in.nextLine();
        System.out.print("Nhap diem TX1: ");
        diemTX1 = Float.parseFloat(in.nextLine());
        System.out.print("Nhap diem TX2: ");
        diemTX2 = Float.parseFloat(in.nextLine());
        System.out.print("Nhap diem ket thuc hoc phan: ");
        diemTX1 = Float.parseFloat(in.nextLine());
        System.out.print("Nhap so tiet nghi: ");
        soTietNghi = Integer.parseInt(in.nextLine());

    }
}
