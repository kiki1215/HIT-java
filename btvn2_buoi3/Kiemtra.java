package btvn2_buoi3;
import java.util.Scanner;
public class Kiemtra {
    public static void check(String s){
        s= s.toLowerCase();
        boolean check = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(s.toUpperCase());
            System.out.println("Chuoi nay doi xung.");
        }
        else{
            System.out.println(s.toLowerCase());
            System.out.println("Chuoi nay khong doi xung");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String s = in.nextLine();
        check(s);
        in.close();
    }
}
