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
        Scanner in = new Scanner(System.in);
        ProductServiceImlp a = new ProductServiceImlp();
        a.fakeData();
        a.printProduct();
        while(true){
            System.out.println("====MENU======");
            System.out.println("1. Them san Pham");
            System.out.println("2. Sua thong tin theo ID");
            System.out.println("3. Xoa san Pham");
            System.out.println("4. Tim san pham theo ten");
            System.out.println("0. Thoat");
            System.out.println("Chuc nang ban muon chon: ");
            int choice = in .nextInt();
            in.nextLine();
            switch(choice){
                case 1 ->{
                    Product p = null;
                    p.nhapThongTin();
                    a.addProduct(p);
                }
                case 2 -> {
                    System.out.println("Nhap id: ");
                    String id = in.nextLine();
                    a.updateProduct(id);
                }
                case 0 ->{
                    return;
                }
                case 3->{
                    System.out.println("Nhap ma san pham muon xoa: ");
                    String id = in.nextLine();
                    a.deleteProduct(id);
                }
                case 4 ->{
                    System.out.println("Nhap ten san pham muon tim: ");
                    String name = in.nextLine();
                    a.findByName(name);
                }
                case 5 ->{
                    a.printProduct();
                }
                default->{
                    System.out.println("Chon khong hop le!");
                }
            }
                    
        }
    }
}
