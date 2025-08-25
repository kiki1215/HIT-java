/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author khoihoang
 */
public interface ProductService {
    public void addProduct(Product p);
    public void updateProduct(String id);
    public void deleteProduct(String id);
    public Product findByName(String name);
    public void sortByPriceAsc();
    public void sortByPriceDesc();
    public void printProduct();
}
