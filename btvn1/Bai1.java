/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package btvn1;
import java.util.Scanner;
/**
 *
 * @author khoihoang
 */
public class Bai1 {
    
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);){
            System.out.print("Nhap ten cua ban: ");
            String name = in.nextLine();
            System.out.print("Nhap tuoi cua ban: ");
            byte age = in.nextByte();
            System.out.print("Nhap chieu cao cua ban: ");
            double height = in.nextDouble();
            System.out.println("Xin chao " + name +", ban " + age + " tuoi va cao " + height + " met.");
         }
    }
}
