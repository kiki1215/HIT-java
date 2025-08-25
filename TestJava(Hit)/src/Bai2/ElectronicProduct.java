/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author khoihoang
 */
public class ElectronicProduct extends Product {

    public ElectronicProduct(String name, String category, double price, int quantity, Manufacturer manufacturer) {
        super(name, category, price, quantity, manufacturer);
    }
    
    @Override
    double getDiscountPrice() {
        return (price *90)/100;
    }
    
}
