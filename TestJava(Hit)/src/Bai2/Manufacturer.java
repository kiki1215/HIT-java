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
public class Manufacturer {
    String id , name, address, email;

    public Manufacturer() {
    }

    public Manufacturer(String id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public void nhapThongtin(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma nha may: ");
        id = in.nextLine();
        System.out.println("Nhap ten nha may: ");
        name = in.nextLine();
        System.out.println("Nhap dia chi: ");
        address = in.nextLine();
        System.out.println("Nhap email lien he: ");
        email = in.nextLine();
    }
}
