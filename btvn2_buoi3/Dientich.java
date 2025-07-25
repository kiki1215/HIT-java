package btvn2_buoi3;
import java.util.Scanner;
public class Dientich{
     public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";
    public static Scanner in = new Scanner(System.in);
    public static void tinhDTV(){
        System.out.println("Nhap canh vien gach: ");
        double n = Integer.parseInt(in.nextLine());
        System.out.println("Dien tich hinh vuong la: " + n*n);
    }
    public static void tinhDTT(){
        System.out.println("Nhap ban kinh vien gach: ");
        double n = Integer.parseInt(in.nextLine());
        System.out.println("Dien tich hinh tron la: " + (Math.PI *n*n));
    }
    public static void tinhDTTG(){
        System.out.println("Nhap chieu cao vien gach: ");
        double n = Integer.parseInt(in.nextLine());
        System.out.println("Nhap canh day vien gach: ");
        double m = Integer.parseInt(in.nextLine());
        System.out.println("Dien tich vien gach hinh tam giac la: " + (n*m)/2);
    }
    public static void main(String[] args) {
        System.out.println("Nhap hinh dang cua vien gach:");
        String type = in.nextLine();
        if(type.equalsIgnoreCase(SQUARE)){
            tinhDTV();
        }
        else if(type.equalsIgnoreCase(TRIANGLE)){
            tinhDTTG();
        }
        else if(type.equalsIgnoreCase(CIRCLE)){
            tinhDTT();
        }
        else
        System.out.println("Hinh dang ban nhap ko hop le!");
    }
}