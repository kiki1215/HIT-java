/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class Main {
    public static void main(String[] args) {
        StudentManager a = new StudentManager();
        Scanner in = new Scanner(System.in);
        a.fakeData();
        while(true){
            System.out.println("=====Quan ly hoc sinh=====");
            System.out.println("1.Sap xep theo diem giam dan");
            System.out.println("2. Sap Xep theo diem tang dan");
            System.out.println("3. Tim hoc sinh theo ten");
            System.out.println("4. In danh sach hoc sinh");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            int choice = in.nextInt();
            in.nextLine();
            switch(choice) {
                case 1 ->{
                    a.sortByScoreAsc();
                }
                case 2 -> {
                    a.sortByScoreDesc();
                }
                case 3 ->{
                    System.out.println("Nhap ten hoc sinh can tim: ");
                    String name = in.nextLine();
                    a.findByName(name);
                }
                case 4 ->{
                    a.printStudents();
                }
                case 5 ->{
                    return;
                }
                default ->{
                    System.out.println("Nhap khong hop le!");
                }
            }
        }
    }
}
