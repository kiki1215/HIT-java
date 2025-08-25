/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author khoihoang
 */
public class ClothingProduct extends Product {

    public ClothingProduct(String name, String category, double price, int quantity, Manufacturer manufacturer) {
        super(name, category, price, quantity, manufacturer);
    }

    @Override
    double getDiscountPrice() {
        return (price * 80)/100;
    }
    
}
