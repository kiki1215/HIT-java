/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cham_Soc_Trai_Thu;

/**
 *
 * @author khoihoang
 */
public class Pet {
    String name, species;
    double weight;

    public Pet(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
    
    public void printIn4(){
        System.out.println("Ten: "+ name);
        System.out.println("Loai: " + species);
        System.out.print("Can nang: " );
        System.out.printf("%-5.2f\n", weight); 
   }
    public boolean isOverWeight(){
        return weight > 10;
    }
    public String getBasicIn4(){
        return "Ten: " + name + ", Loai: " + species;
    }
}
