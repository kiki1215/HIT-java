/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cham_Soc_Trai_Thu;

import java.util.ArrayList;

/**
 *
 * @author khoihoang
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets1 = new ArrayList<>();
        ArrayList<Pet> pets2 = new ArrayList<>();
        Pet b = new Pet("Mickey", "Cho", 10.6f);
        Pet c = new Pet("Gung", "Meo", 12.6f);
        Pet d = new Pet("Tuyet", "Meo", 9.6f);
        Cage c1 = new Cage("Long 1",pets1,0);
        Cage c2 = new Cage("Long 2",pets2,2);
        c1.addPet(b);
        c2.addPet(c);
        c1.addPet(d);
        System.out.println("So long da tao: " + Cage.totalCages);
        System.out.println("Danh sach thu long 1");
        c1.printAllPets();
        System.out.println("Danh sach thu long 2");
        c2.printAllPets();
        System.out.println("Danh thu lon hon 10 kg o ca 2 long");
        for(Pet i : c1.pets){
            if(i.isOverWeight())
                System.out.println(i.getBasicIn4());
        }
        for(Pet i : c2.pets){
            if(i.isOverWeight())
                System.out.println(i.getBasicIn4());
        }
    }
}
