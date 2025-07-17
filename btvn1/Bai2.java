/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Bai2 {
        public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Nhap ten hoc sinh: ");
            String name = in.nextLine();
            System.out.print("Nhap tuoi: ");
            byte age = in.nextByte();
            System.out.print("Nhap lop hoc: ");
            in.nextLine();
            String lop = in.nextLine();
            System.out.println("Nhap diem trung binh: ");
            double dTB = in.nextDouble();
            System.out.println("Ten: " + name +" - Tuoi: " + age + " - Lop: " + lop + " - GPA: " + dTB);
        }
    }
}
