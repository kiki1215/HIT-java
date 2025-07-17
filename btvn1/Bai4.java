/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;
import java.util.Scanner;
/**
 *
 * @author khoihoang
 */
public class Bai4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a[] = new int[5];
            System.out.println("Nhap mang: ");
            for (int i = 0; i < 5; i++) {
                a[i] = in.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += a[i];
            }
            System.out.println("Tong cac phan tu trong mang: " + sum);
            int temp = a[0];
            for (int i = 1; i < 5; i++) {
                if(temp < a[i])
                {
                    temp = a[i];
                }
            }
            System.out.println("Gia tri lon nhat trong mang la: " + temp);
        }
    }
}
