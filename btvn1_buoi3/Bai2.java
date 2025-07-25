package btvn1_buoi3;

public class Bai2 {
    public static final double PI = 3.14159265;
    static double r;
    static int k;
    public static java.util.Scanner in = new java.util.Scanner(System.in);
    public static void tinhCVDT(double r){
        System.out.println("Chu vi hinh tron la: " + (2 * PI * r));
        System.out.println("Dien tich cua hinh tron la: " + (PI * r * r));
    }
    public static void tinhMath(double r, int k){
        System.out.println("Luy thua k cua ban kinh r la: " + Math.pow(r, k));
        System.out.println("Can bac 2 cua tong r + k la: " + Math.sqrt(r + k));
        System.out.println("Gia tri tuyet doi cua r - k la: " + Math.abs(r - k));
    }
    public static void main(String[] args) {
        System.out.print("Nhap ban kinh cua hinh tron: ");
        r = in.nextDouble();
        System.out.print("Nhap so mu: ");
        k = in.nextInt();
        tinhCVDT(r);
        tinhMath(r,k);
    }
}
