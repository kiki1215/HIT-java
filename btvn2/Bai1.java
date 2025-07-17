package btvn;
import java.util.Scanner;
public class Bai1 {
    public static final double PI  = 3.14;
    public static Scanner in = new Scanner(System.in);

    public static double nhapBanKinh(){
        double r;
        do {
            System.out.print("Nhap ban kinh r trong khoang (1,1000): ");
            r = in.nextDouble();
            if (r <= 1 || r >= 1000) {
                System.out.println("Ban nhap loi vui long nhap lai!");
            }
        } while (r <= 1 || r >= 1000);
        return r;
    }
    public static double chuVi(double r){
        double p = 2 * PI * r;
        return p;
    }
    public static double dienTich(double r){
        double s = PI * Math.pow(r,2);
        return s;
    }
    public static void main(String[] args) {
        double r = nhapBanKinh();
        System.out.printf("%.3f %.3f", chuVi(r), dienTich(r));
    }
}
