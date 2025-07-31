/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_trenLopB4;

/**
 *
 * @author khoihoang
 */
public class Car {
    String brand;
    int maxSpeed;
    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed= maxSpeed;
    }
    public void run(){
        System.out.println("Xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km/h");
    }
    public static void main(String[] args) {
        Car a = new Car("lamborghini", 320);
        a.run();
    }
}
