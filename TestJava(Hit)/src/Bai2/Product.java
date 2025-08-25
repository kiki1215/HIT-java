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
abstract class Product {
    String id;
    String name, category;
    double price;
    int quantity;
    Manufacturer manufacturer;
    abstract double getDiscountPrice();

    public Product() {
        manufacturer = new Manufacturer();
    }

    public Product(String name, String category, double price, int quantity, Manufacturer manufacturer) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }
    public void nhapThongTin(){
        Scanner in = new  Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        id = in.nextLine();
        System.out.println("Nhap ten san pham: ");
        name = in.nextLine();
        System.out.println("Nhap gia san pham: ");
        price = in.nextDouble();
        System.out.println("Nhap so luong ton kho: ");
        quantity = in.nextInt();
        in.nextLine();
        manufacturer.nhapThongtin();
                
    }
    public static void inTieuDe(){
        System.out.printf("%-5s %-10s %-10s  %-10s %-10s %-10s %-20s\n", "ID", "Name", "Category", "Manufacturer<Name>", "Quantity", "Price", "Discount Price");
    }
    public void hienThongTin(){
        System.out.printf("%-5s %-10s %-10s %-10s %-10d %-10.2f %-20.2f\n", id, name, category, manufacturer.name, quantity, price, getDiscountPrice());
        
    }
    
}
