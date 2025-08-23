/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class DemKyTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu: ");
        String chuoi = in.nextLine();
        int countThuong = 0;
        int countHoa = 0;
        for(int i = 0; i < chuoi.length(); i++){
            char temp = chuoi.charAt(i);
            if("aeiouAEIOU".indexOf(temp) != -1){
                countThuong++;
            }else if(temp >= 'A' && temp <= 'W')
                countHoa++;
        }
        System.out.println("So ky tu nguyen am ko phan biet hoa thuong la: " + countThuong);
        System.out.println("So ky tu in hoa la: " + countHoa);
        
    }
}
