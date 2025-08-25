/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class ProductServiceImlp implements ProductService {
    ArrayList<Product> product; 
    
    public void fakeData() {
        Manufacturer a = new Manufacturer("NM001", "THang Long", "Ha Noi", "Exam@gmail.com");
        ElectronicProduct b = new ElectronicProduct("May Lanh", "Do dien tu", 1245.3, 100, a);
        FoodProduct c = new FoodProduct("ga ran", "Thuc an", 10, 100, a);
        ClothingProduct d = new ClothingProduct("quan jeans", "Quan ao", 100.5,50 ,a);
    }   
    public ProductServiceImlp() {
    }
    @Override
    public void addProduct(Product p) {
        product.add(p);
    }

    @Override
    public void updateProduct(String id){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma san pham muon sua: ");
        id = in.nextLine();
        for(int i = 0; i < product.size(); i++){
            if(id.equalsIgnoreCase(product.get(i).id)){
                product.get(i).nhapThongTin();
            }
        }
    }

    @Override
    public void deleteProduct(String id) {
        for(Product i : product){
            if(id.equalsIgnoreCase(i.id)){
                product.remove(i);
            }
        }
    }

    @Override
    public Product findByName(String name) {
        boolean check = false;
        for(Product i : product){
            if(name.equalsIgnoreCase(i.name)){
                check = true;
                i.hienThongTin();
                return i;
            }
        }
        if(!check)
            System.out.println("Khong co san pham ban can tim!");
        return null;
    }

    @Override
    public void sortByPriceAsc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sortByPriceDesc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void printProduct() {
        Product.inTieuDe();
        for(Product i : product){
            i.hienThongTin();
        }
    }
    
}
