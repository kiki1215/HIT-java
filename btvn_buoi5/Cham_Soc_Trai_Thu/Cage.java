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
public class Cage {
    String cageCode;
    ArrayList<Pet> pets;
    int currentPetCount;
    public static int totalCages;
    public final int MAX_CAPACITY = 3;

    public Cage(String cageCode, int currentPetCount) {
        this.cageCode = cageCode;
        this.currentPetCount = currentPetCount;
        totalCages++;
    }

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetCount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        totalCages++;
    }
    public void addPet(Pet pet){
        if(currentPetCount < MAX_CAPACITY){
            pets.add(pet);
        }
    }
    public void printAllPets(){
        for(Pet i : pets){
            i.printIn4();
        }
    }
    
}
